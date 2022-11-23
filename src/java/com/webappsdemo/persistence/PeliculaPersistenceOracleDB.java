package com.webappsdemo.persistence;

import com.webappdemo.model.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class PeliculaPersistenceOracleDB implements IPeliculaPersistence{

    @Override
    public List<Pelicula> findAll() {
        Pelicula batman = new Pelicula("Batman","https://m.media-amazon.com/images/I/81Bivc7COzL.jpg");
        Pelicula spiderman = new Pelicula("Spiderman", "https://c8.alamy.com/compes/2jhm2pd/andrew-garfield-poster-el-increible-spider-man-2012-2jhm2pd.jpg");
        Pelicula hulk = new Pelicula("Hulk", "https://i.pinimg.com/736x/46/1d/45/461d45018ec3d512c3edb4bfbbf79962.jpg");
        List<Pelicula> pelis = new ArrayList<Pelicula>();
        pelis.add(batman);
        pelis.add(spiderman);
        pelis.add(hulk);
        return pelis;
    }
    
}
