package com.ams.catalog.domain;

public class LeftMenuEntry {
    private String department;
    private String category;

    public LeftMenuEntry(String department, String category) {
        this.department = department;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getDepartment() {
        return department;
    }
}
