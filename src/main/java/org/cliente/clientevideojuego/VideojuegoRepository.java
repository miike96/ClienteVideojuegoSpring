package org.cliente.clientevideojuego;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {


    @Query("SELECT v FROM Videojuego v")
    List<Videojuego> findAllVideojuegos();


    @Query("SELECT v FROM Videojuego v WHERE v.favorito = true")
    List<Videojuego> findFavoritos();


    @Query("SELECT v FROM Videojuego v WHERE v.id = :id")
    Videojuego findVideojuegoById(Integer id);
}
