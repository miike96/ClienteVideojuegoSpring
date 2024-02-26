package org.cliente.clientevideojuego;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/VideojuegoCliente")
public class VideojuegoController {

    @Autowired
    private final VideojuegoRepository repository;

    public VideojuegoController(VideojuegoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/videojuegos")
    public List<Videojuego> allVideojuegos(){
        return repository.findAll();
    }

    @GetMapping("/videojuegos/{id}")
    public Videojuego videojuegoById(@PathVariable Integer id){
        return repository.findVideojuegoById(id);
    }

    @GetMapping("/videojuegos/favoritos")
    public List<Videojuego> videojuegosFavoritos(){
        return repository.findFavoritos();
    }
}
