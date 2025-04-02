package com.englishmovie.moviemng.genre;
import com.englishmovie.moviemng.actor.Actor;

public class Genre {
    public int genreId;
    public String genreName;
    public Actor[] actors;



    public void displayGenre() {
        System.out.println("Genre ID: " + genreId);
        System.out.println("Genre Name: " + genreName);
        System.out.println("Actors in this Genre:");
        for (Actor actor : actors) {
            actor.displayActor();
        }


    }
}
