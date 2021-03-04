Feature: Search Amazon catalog by category

  Background:
  Peta is a pet lover
    Given Peta is on the Amazon home page

  Scenario: Find products by featured categories
    When Peta navigates through the following categories:
      | Department               | Category     |
      | Home, Garden, Pets & DIY | Pet Supplies |
    And she chooses the following category in the menu bar:
      | Category | Subcategory |
      | Dogs     | Food        |
    And she filters the products by:
      | Brand  | Pedigree |
    Then the displayed products should include "Pedigree Small Bite Mixer Original 1.5kg"
