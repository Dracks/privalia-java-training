package com.privalia.dao;

public enum FileType {
    CSV,
    JSON;

    public String toExtension() {
        switch (this){
            case CSV:
                return ".csv";
            case JSON:
                return ".json";
        }
        return "";
    }
}
