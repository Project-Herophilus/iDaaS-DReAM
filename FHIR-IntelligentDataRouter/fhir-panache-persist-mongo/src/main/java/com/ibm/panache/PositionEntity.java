package com.ibm.panache;

import io.quarkus.mongodb.panache.PanacheMongoEntityBase;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class PositionEntity extends PanacheMongoEntityBase {
    public double longitude;
    public double latitude;
}
