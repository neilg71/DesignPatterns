package org.njg.designpatterns.dependencyinversion.model;

import java.util.Timer;
import java.util.TimerTask;

public class Cookie extends BakedGood{


    @Override
    public void startCooking() {
        System.out.println("start cooking");
        TimerTask task = new TimerTask(){
            public void run(){
                System.out.println("timer fired");
                stopCooking();
            }
        };

        Timer timer = new Timer("timer");
        long delay = 500L;
        timer.schedule(task,delay);
    }

    @Override
    public void stopCooking() {
        System.out.println("stop cooking");
        done=true;
    }
}
