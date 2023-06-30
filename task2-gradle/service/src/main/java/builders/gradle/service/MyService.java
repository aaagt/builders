package builders.gradle.service;

import builders.gradle.db.Db;
import builders.gradle.db.DbSetting;
import builders.gradle.db.MyEntity;

import java.util.UUID;

public class MyService {

    private final DbSetting dbSetting = new DbSetting("name", "password");
    private final String name = "myService";
    private final Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}
