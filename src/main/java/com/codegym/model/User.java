package com.codegym.model;

public class User {
    private String language;
    public String page_size;
    private String spams_filter;
    private String signature;

    public User(String language, String page_size, String spams_filter, String signature) {
        this.language = language;
        this.page_size = page_size;
        this.spams_filter = spams_filter;
        this.signature = signature;
    }

    public User() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getSpams_filter() {
        return spams_filter;
    }

    public void setSpams_filter(String spams_filter) {
        this.spams_filter = spams_filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
