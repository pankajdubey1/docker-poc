package com.docker.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DockerRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<String> getDataFromTable(String tableName) {
		String sql = "select * from " + tableName;
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		List<String> result = new ArrayList<String>();
		for (Map row : queryForList) {
			result.add((String) row.get("data_col"));
		}
		return result;
	}
}
