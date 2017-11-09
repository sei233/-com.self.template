package com.self.template.history;

/**
 * Created by 石乾 on 2017/11/9.
 */

public class record {

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public record(String time, String location, String state) {
        this.time = time;
        this.location = location;
        this.state = state;
    }

    private String time;
    private String location;
    private String state;

}
