package org.njg.designpatterns.dependencyinversion.model;

public class ChocolateChipCookie extends Cookie{

    public ChocolateChipCookie() {
        addIngredient(new Ingredient("dough", "hand mixed", 5));
        addIngredient(new Ingredient("chocolate chips", "Chips Ahoy", 50));
        addIngredient(new Ingredient("sugar", "pure cane", 2));
        addIngredient(new Ingredient("butter", "stick", 1));
    }

}
