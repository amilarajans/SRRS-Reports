package com.origins.dao;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
public class KeyValue {
    String key;
    String value;

    public KeyValue(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
