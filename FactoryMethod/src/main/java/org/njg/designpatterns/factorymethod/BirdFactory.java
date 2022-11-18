package org.njg.designpatterns.factorymethod;

public class BirdFactory {

    static public Bird createSongBird(){
        return new SongBird();
    }

    static public Bird createBlackBird(){
        return new BlackBird();
    }
}
