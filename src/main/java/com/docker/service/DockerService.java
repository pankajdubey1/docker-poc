package com.docker.service;

import java.util.List;

public interface DockerService {

	List<String> getDataFromTable(String countryCode);
}
