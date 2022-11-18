package org.njg.designpatterns;

import org.njg.designpatterns.dependencyinversion.controller.Oven;
import org.njg.designpatterns.dependencyinversion.model.ChocolateChipCookie;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        Oven oven = new Oven(new ChocolateChipCookie());
        oven.startCooking();
        while(!oven.isDone()) {
            counter++;
            System.out.println("ctr++");
        }
        oven.stopCooking();
        System.out.println("counter: " + counter);
    }
}