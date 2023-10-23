package org.example;

public class QueryString {

    private final String key;
    private final String value;

    // 여러개면 List<Query>를 만들면 된다.
    public QueryString(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public boolean exists(String key) {
        return this.key.equals(key);
    }

    public String getValue() {
        return this.value;
    }
}