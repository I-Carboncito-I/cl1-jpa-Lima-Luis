package pe.edu.i202221574.crud;

import jakarta.persistence.*;
import pe.edu.i202221574.entity.Country;

import java.util.List;

public class JPAFind {

    public static void main(String[] args) {
        // Crear una instancia de EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1-jpa-Lima-Luis");
        EntityManager em = emf.createEntityManager();

        // Buscar el país con código "PER"
        Country peru = em.find(Country.class, "PER");

        if (peru != null) {
            System.out.println("Ciudades de Perú con población > 700k:");

            // Filtrar y mostrar las ciudades con población > 700,000
            peru.getCities().stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .forEach(city -> System.out.println(city.getName()));
        } else {
            System.out.println("No se encontró el país con código PER.");
        }

        // Cerrar EntityManager
        em.close();
        emf.close();
    }
}

