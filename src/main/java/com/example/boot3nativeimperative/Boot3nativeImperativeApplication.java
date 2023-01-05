package com.example.boot3nativeimperative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@ImportRuntimeHints(MyRuntimeHints.class)
@EnableElasticsearchRepositories
@SpringBootApplication
public class Boot3nativeImperativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot3nativeImperativeApplication.class, args);
	}

}
