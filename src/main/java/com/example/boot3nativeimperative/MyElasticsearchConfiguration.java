/*
 * (c) Copyright 2023 sothawo
 */
package com.example.boot3nativeimperative;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */
@Configuration
public class MyElasticsearchConfiguration extends ElasticsearchConfiguration {
	@Override
	public ClientConfiguration clientConfiguration() {
		return ClientConfiguration.builder()
			.connectedTo("localhost:9200")
			.withBasicAuth("elastic", "hcraescitsale")
			.build();
	}
}
