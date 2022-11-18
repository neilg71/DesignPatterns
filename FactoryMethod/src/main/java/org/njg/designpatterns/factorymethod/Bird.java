package org.njg.designpatterns.factorymethod;

public abstract class Bird {

    enum BirdType{
        BLACKBIRD,
        SONGBIRD
    };

    private String sound;
    protected Bird(){}

    public String getSound(){
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public static Bird createBird(BirdType type){
        return switch(type){
            case SONGBIRD -> new SongBird();
            case BLACKBIRD -> new BlackBird();
            default -> null;
        };

    }
}
