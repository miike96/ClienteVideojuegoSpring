package org.cliente.clientevideojuego;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ClienteVideojuegoApplication implements CommandLineRunner {

    private Scanner teclado = new Scanner(System.in);

    private final VideojuegoRepository repository;

    public ClienteVideojuegoApplication(VideojuegoRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClienteVideojuegoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar todos los videojuegos");
            System.out.println("2. Mostrar un videojuego por su id");
            System.out.println("3. Mostrar todos los videojuegos favoritos");
            System.out.println("4. Añadir un videojuego a favoritos");
            System.out.println("0. Salir");

            System.out.println("Seleccione una opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
//                case 1:
//                    mostrarVideojuegos();
//                    break;
//                case 2:
//                    System.out.print("Ingrese el ID del videojuego: ");
//                    int idVideojuego = teclado.nextInt();
//                    mostrarVideojuego(idVideojuego);
//                    break;
                case 3:
                    mostrarFavoritos();
                    break;
                case 4:
                    System.out.print("Ingrese el ID del videojuego: ");
                    int idFavorito = teclado.nextInt();
                    addFavorito(idFavorito);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    //Metodo para añadir un videojuego a favoritos
    public void addFavorito(Integer id){
        Videojuego videojuego = repository.findVideojuegoById(id);
        videojuego.setFavorito(true);
        repository.save(videojuego);
    }

    //Metodo para mostrar todos los videojuegos favoritos
    public void mostrarFavoritos(){
        for (Videojuego videojuego : repository.findFavoritos()) {
            System.out.println(videojuego);
        }
    }

}
