package com.ams.catalog.domain;

public class TopMenuCategory {
    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    private final String category;
    private final String subcategory;

    public TopMenuCategory(String category, String subcategory) {
        this.category = category;
        this.subcategory = subcategory;
    }
}
