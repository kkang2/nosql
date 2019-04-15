package com.psj.db.mongosync.connection.spring;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringMongoTemplate {
	private final MongoTemplate mongoTemplate;
	
	public SpringMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public static void main(String[] args) {

	}
}
