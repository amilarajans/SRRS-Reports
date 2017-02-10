package com.origins.dao;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Amila-Kumara on 06/02/2017.
 */
public class SearchData {
    private List<String> allTypes;
    private String type;
    private String resource;
    private String user;
    private Date date;

    public SearchData() {
        allTypes= Arrays.asList("Chart","Table");
    }

    public List<String> getAllTypes() {
        return allTypes;
    }

    public void setAllTypes(List<String> allTypes) {
        this.allTypes = allTypes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
