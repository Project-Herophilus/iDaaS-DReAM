package com.ibm.panache;


import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class RecorderEntity extends PanacheMongoEntityBase {
   public String reference;
}
