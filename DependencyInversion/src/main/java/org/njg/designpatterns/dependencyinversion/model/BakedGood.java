package org.njg.designpatterns.dependencyinversion.model;

import java.util.ArrayList;
import java.util.List;

public abstract class BakedGood {
    boolean done = false;
    public boolean isDone(){
        return done;
    }
    public abstract void startCooking();
    public abstract void stopCooking();
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    private List<Ingredient> ingredients = new ArrayList<>();

}
