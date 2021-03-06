package com.ams.catalog.domain;

public class LeftPanelHomeDeptCategory {
    public String getDepartment() {
        return Department;
    }

    public String getCategory() {
        return Category;
    }

    private final String Department;
    private final String Category;


    public LeftPanelHomeDeptCategory(String department, String category) {
        Department = department;
        Category = category;
    }
}
