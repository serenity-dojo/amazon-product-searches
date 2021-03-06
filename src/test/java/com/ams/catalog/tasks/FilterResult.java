package com.ams.catalog.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterResult extends UIInteractionSteps {

    public List<String> displayedResults() {
      return findAll(FilterSearchResult.ITEMS).stream().map(WebElementFacade::getTextContent).collect(Collectors.toList());
    }
}
