package com.ams.catalog.actions.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuComponent {
    public static final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    public static By SIDEBAR_MENU_ICON = By.cssSelector(".hm-icon");
    public static By TOPBAR_MENU_ICON = By.xpath("//span[@class='nav-a-content'][contains(.,'Dogs')]");
    public static By TOP_SUBMENU_ICON = By.xpath("//span[@class='a-size-medium a-color-base a-text-bold'][contains(.,'Food')]");

    static String categoryEntry(String categoryName){
        return "//span[@class='nav-a-content'][contains(.,'"+ categoryName +"')]";
    }
    static String subCategoryEntry(String subCategory){
        return "//p[contains(.,'Browse')]//a[contains(.,'"+ subCategory +"')]";
    }
}
