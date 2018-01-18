package com.privalia.model;

import java.util.UUID;

public class PrivaliaObject {
    private UUID uuid;

    public PrivaliaObject(){
        uuid = UUID.randomUUID();
    }

    public PrivaliaObject(UUID uuid){
        this.uuid = uuid;
    }

    public UUID getUuid(){
        return this.uuid;
    }
}
