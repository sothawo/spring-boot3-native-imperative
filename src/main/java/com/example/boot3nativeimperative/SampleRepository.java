/*
 * (c) Copyright 2023 sothawo
 */
package com.example.boot3nativeimperative;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */
public interface SampleRepository extends ElasticsearchRepository<SampleEntity, String> {
}
