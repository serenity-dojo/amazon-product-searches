package com.ams.catalog.domain;

public class   Brand {
    public String getBrandName() {
        return brandName;
    }

    private final String brandName;

    public Brand(String brandName) {
        this.brandName = brandName;
    }
}
