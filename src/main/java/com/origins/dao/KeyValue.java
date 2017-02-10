package com.origins.dao;

/**
 * Created by Amila-Kumara on 03/02/2017.
 */
public class KeyValue<T> {
    T key;
    String value;

    public KeyValue(T key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
