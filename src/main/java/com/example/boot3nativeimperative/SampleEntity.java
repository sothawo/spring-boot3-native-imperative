package com.example.boot3nativeimperative;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */
@Document(indexName = "sample-entities")
public record SampleEntity(
	@Id String id,
	String value
) {
}
