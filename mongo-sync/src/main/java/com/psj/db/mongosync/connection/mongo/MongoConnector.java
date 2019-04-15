package com.psj.db.mongosync.connection.mongo;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnector {
	public static MongoClient getMongoClient() {
		return MongoClients.create(
				MongoClientSettings.builder()
                	.applyToClusterSettings(builder ->
                        builder.hosts(Arrays.asList(new ServerAddress("192.168.203.101", 21017))))
                	.build());
	}
	
	public static MongoClient getMongoClient(String connString) {
		return MongoClients.create(connString);
		//return MongoClients.create("mongodb://192.168.203.101:21017,hostTwo:27018");
	}
	
	public static MongoDatabase getDatabase(MongoClient mongoClient, String databaseNm) {
		return mongoClient.getDatabase(databaseNm);
	}
	
	public static MongoCollection<Document> getCollection(MongoDatabase database, String collectionNm) {
		return database.getCollection(collectionNm);
	}
	
	public static void main(String[] args) {
		
	}
}
