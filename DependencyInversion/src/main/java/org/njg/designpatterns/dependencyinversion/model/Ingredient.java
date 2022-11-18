package org.njg.designpatterns.dependencyinversion.model;

public class Ingredient {
    private String name;
    private String description;
    private int amt;

    public Ingredient(String name, String description, int amt) {
        this.name = name;
        this.description = description;
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amt=" + amt +
                '}';
    }
}
