package com.docker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.repo.DockerRepo;
import com.docker.service.DockerService;

@Service
public class DockerServiceImpl implements DockerService {

	@Autowired
	private DockerRepo dockerRepo;

	@Override
	public List<String> getDataFromTable(String tableName) {
		return dockerRepo.getDataFromTable(tableName);
	}
}
