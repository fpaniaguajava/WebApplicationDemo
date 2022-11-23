package com.webappsdemo.persistence;

public class PeliculaPersistenceFactory {
    public IPeliculaPersistence newInstance(){
        return new PeliculaPersistenceOracleDB();
    }
}
