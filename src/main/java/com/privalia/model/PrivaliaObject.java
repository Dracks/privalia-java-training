package com.privalia.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class PrivaliaObject {
    @Getter
    private UUID uuid;

    public PrivaliaObject(){
        uuid = UUID.randomUUID();
    }

    public PrivaliaObject(UUID uuid){
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return uuid.toString();
    }

    public PrivaliaObject(String[] data){
        this.uuid = UUID.fromString(data[0]);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof PrivaliaObject) && this.uuid.equals(((PrivaliaObject)obj).uuid);
    }

    @Override
    public int hashCode() {
        return this.uuid.hashCode();
    }
}
