package org.njg.designpatterns.factorymethod;

public class Planet {
    int size;
    boolean isGas;
    String name;

    enum PlanetNames{
        Jupiter,
        Mars,
        Saturn
    };

    private Planet(String name, int size, boolean isGas){
        this.name = name;
        this.size = size;
        this.isGas = isGas;
    }

    public static Planet createJupiter(){
        return new Planet("Jupiter", 100000, true);
    }

    public static Planet createSaturn(){
        return new Planet("Saturn", 50000, true);
    }

    public static Planet createMars(){
        return new Planet("Mars", 1000, false);
    }


    public static Planet createPlanet(PlanetNames planetName){
        Planet planet= null;
        switch (planetName){
            case Jupiter:
                planet =  createJupiter();
                break;
            case Mars:
                planet = createMars();
                break;
            case Saturn:
                planet = createSaturn();
                break;
        }
        return planet;

    }

    @Override
    public String toString() {
        return "Planet{" +
                "name=" + name +
                " size=" + size +
                ", isGas=" + isGas +
                '}';
    }
}
