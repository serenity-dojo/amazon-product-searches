package com.ams.catalog.actions.navigation;

import com.ams.catalog.domain.Brand;
import com.ams.catalog.domain.LeftPanelHomeDeptCategory;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class NavigateActions extends UIInteractionSteps {

    public void toTheAmazonHomePage() {
        this.openUrl("https://www.amazon.co.uk/");
    }

//    public void throughTheLeftNavigationPanelTo(String department, String category) {
//        $(TopMenuComponent.SIDEBAR_MENU_ICON).click();
//        waitFor(visibilityOfElementLocated(SidebarMenuComponent.CUSTOMER_AVATAR));
//        findBy(SidebarMenuComponent.DEPARTMENT, department).click();
//
//        waitFor(visibilityOfElementLocated(By.xpath(SidebarMenuComponent.categoryEntry(category))));
//        findBy(SidebarMenuComponent.categoryEntry(category)).click();
//    }

    public void throughTheLeftHomeDepartmentCategory(LeftPanelHomeDeptCategory category) {
        $(TopMenuComponent.SIDEBAR_MENU_ICON).click();
        waitFor(visibilityOfElementLocated(SidebarMenuComponent.CUSTOMER_AVATAR));
        findBy(SidebarMenuComponent.departmentEntry(category.getDepartment())).click();

        waitFor(visibilityOfElementLocated(By.xpath(SidebarMenuComponent.categoryEntry(category.getCategory()))));
        findBy(SidebarMenuComponent.categoryEntry(category.getCategory())).click();

    }


    public void filterDogFoodByBrand(Brand brand) {
        waitFor(visibilityOfElementLocated(By.cssSelector(SidebarMenuComponent.brandEntry(brand.getBrandName()))));

        findBy(SidebarMenuComponent.brandEntry(brand.getBrandName())).click();

    }
}
