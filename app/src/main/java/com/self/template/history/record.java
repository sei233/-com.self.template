package com.self.template.history;

/**
 * Created by 石乾 on 2017/11/9.
 */

public class record {

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public record(String name, String location, String state) {
        this.name = name;
        this.location = location;
        this.state = state;
    }

    private String name;
    private String location;
    private String state;

}
