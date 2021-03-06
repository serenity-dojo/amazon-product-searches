package com.ams.catalog.actions.navigation;

import com.ams.catalog.domain.TopMenuCategory;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TopMenuNavigation extends UIInteractionSteps {
    public void navigate(TopMenuCategory topMenuCategory) {
        $(TopMenuComponent.ACCEPT_COOKIES).click();
        findBy(TopMenuComponent.categoryEntry(topMenuCategory.getCategory())).click();
        findBy(TopMenuComponent.subCategoryEntry(topMenuCategory.getSubcategory())).click();
    }
}
