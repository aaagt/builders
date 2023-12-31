package builders.maven.service;

import builders.maven.db.Db;
import builders.maven.db.DbSetting;
import builders.maven.db.MyEntity;

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
