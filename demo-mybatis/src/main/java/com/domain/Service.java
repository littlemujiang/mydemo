package com.domain;

/**
 * Created by epcm on 2017/8/21.
 */
public class Service {


    private int service_id;
    private String service_name , description;
    private int app_id;
    private long created_at , modified_at;


    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public long getModified_at() {
        return modified_at;
    }

    public void setModified_at(long modified_at) {
        this.modified_at = modified_at;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }
}
