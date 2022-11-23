package com.webappdemo.model;

import com.webappsdemo.persistence.IPeliculaPersistence;
import com.webappsdemo.persistence.PeliculaPersistenceFactory;
import java.util.List;

public class GestorPeliculas {
    public List<Pelicula> findAll() {
        IPeliculaPersistence pp = new PeliculaPersistenceFactory().newInstance();
        List<Pelicula> pelis = pp.findAll();
        return pelis;
    }
}
