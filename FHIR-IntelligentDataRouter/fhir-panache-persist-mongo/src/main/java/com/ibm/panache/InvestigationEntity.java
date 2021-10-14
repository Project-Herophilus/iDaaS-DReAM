package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

import java.util.List;

@MongoEntity
public class InvestigationEntity extends PanacheMongoEntityBase {
    public CodeEntity code;
    public List<ItemEntity> item;
}
