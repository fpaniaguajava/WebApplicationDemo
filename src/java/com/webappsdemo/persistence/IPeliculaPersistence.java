package com.webappsdemo.persistence;

import com.webappdemo.model.Pelicula;
import java.util.List;

public interface IPeliculaPersistence {
    public List<Pelicula> findAll();
}
