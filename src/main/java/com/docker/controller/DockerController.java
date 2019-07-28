package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.docker.service.DockerService;

@RestController
public class DockerController {

	@Autowired
	DockerService dockerService;

	@GetMapping(path = "/data/{tableName}")
	public List<String> getEmployee(@PathVariable String tableName) {
		return dockerService.getDataFromTable(tableName);
	}
}
