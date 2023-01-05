/*
 * (c) Copyright 2023 sothawo
 */
package com.example.boot3nativeimperative;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */

import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;

import java.util.Arrays;

public class MyRuntimeHints implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
		// Register method for reflection
//		Method method = ReflectionUtils.findMethod(MyClass.class, "sayHello", String.class);
		hints.reflection().registerTypes(
			Arrays.asList(
				TypeReference.of("org.springframework.data.elasticsearch.repository.support.SimpleElasticsearchRepository"),
				TypeReference.of("org.springframework.data.elasticsearch.repository.support.SimpleReactiveElasticsearchRepository")
			),
			builder -> builder.withMembers(MemberCategory.INVOKE_DECLARED_CONSTRUCTORS,
				MemberCategory.INVOKE_PUBLIC_METHODS));

		// Register resources
		hints.resources().registerPattern("versions.properties");

		// Register serialization
		hints.serialization().registerType(org.apache.http.impl.auth.BasicScheme.class);

		// Register proxy
//		hints.proxies().registerJdkProxy(MyInterface.class);
	}

}
