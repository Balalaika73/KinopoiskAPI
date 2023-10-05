package com.example.kinopoisk.models;

import java.util.ArrayList;

public class Root {
    public int pagesCount;
    public ArrayList<Film> films;

    public Root(int pagesCount, ArrayList<Film> films) {
        this.pagesCount = pagesCount;
        this.films = films;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }
}
