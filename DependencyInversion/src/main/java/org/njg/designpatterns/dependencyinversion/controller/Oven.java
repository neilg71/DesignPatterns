package org.njg.designpatterns.dependencyinversion.controller;

import org.njg.designpatterns.dependencyinversion.model.BakedGood;

public class Oven {

    BakedGood backedGood;

    public Oven(BakedGood backedGood) {
        this.backedGood = backedGood;
    }


    public void startCooking(){
        this.backedGood.startCooking();
    }

    public void stopCooking(){
        this.backedGood.stopCooking();
    }

    public boolean isDone(){
        return backedGood.isDone();
    }
}
