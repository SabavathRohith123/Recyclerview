package com.example.myrecyclerview.model;

public class moviemodel {
    String actorname;
    int moviecount, movieimage;
    public moviemodel(String actorname, int moviecount, int movieimage) {
        this.actorname = actorname;
        this.moviecount = moviecount;
        this.movieimage = movieimage;
    }

    public String getActorname() {
        return actorname;
    }
    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public int getMoviecount() {
        return moviecount;
    }

    public void setMoviecount(int moviecount) {
        this.moviecount = moviecount;
    }

    public int getMovieimage() {
        return movieimage;
    }

    public void setMovieimage(int movieimage) {
        this.movieimage = movieimage;
    }
}

