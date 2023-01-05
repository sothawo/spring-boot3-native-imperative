/*
 * (c) Copyright 2023 sothawo
 */
package com.example.boot3nativeimperative;

import org.springframework.data.elasticsearch.core.AbstractElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */
@RestController
public class SampleController {
	private final ElasticsearchOperations operations;
	private final SampleRepository repository;

	public SampleController(ElasticsearchOperations operations, SampleRepository repository) {
		this.operations = operations;
		this.repository = repository;
	}

	@GetMapping("/versions")
	public void logVersions() {
		if (operations instanceof AbstractElasticsearchTemplate template) {
			template.logVersions();
		}
	}
}
