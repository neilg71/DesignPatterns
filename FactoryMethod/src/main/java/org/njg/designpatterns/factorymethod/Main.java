package org.njg.designpatterns.factorymethod;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Bird bbird = BirdFactory.createBlackBird();
        System.out.println("black birds song is:" + bbird.getSound());

        Bird songBird = BirdFactory.createSongBird();
        System.out.println("song birds song is:" + songBird.getSound());

        Bird songBird2 = Bird.createBird(Bird.BirdType.SONGBIRD);
        System.out.println("song birds2 song is:" + songBird.getSound());

        Planet jupiter = Planet.createJupiter();
        System.out.println(jupiter.toString());

        Planet mars = Planet.createMars();
        System.out.println(mars.toString());

        Planet saturn = Planet.createPlanet(Planet.PlanetNames.Saturn);
        System.out.println(saturn.toString());

        Employee employee = Employee.getInstance(Manager.class.getSimpleName());
        System.out.println("1: I am a " + employee.getClass().getSimpleName());

        NumberFormat.getInstance();

    }
}