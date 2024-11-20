package pe.edu.i202221574.crud;

import jakarta.persistence.*;
import pe.edu.i202221574.entity.Country;

public class JPARemove {

    public static void main(String[] args) {
        // Crear una instancia de EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1-jpa-Lima-Luis");
        EntityManager em = emf.createEntityManager();

        // Iniciar una transacción
        em.getTransaction().begin();

        // Buscar el país imaginario por su código
        Country countryToDelete = em.find(Country.class, "ZAR");

        if (countryToDelete != null) {
            // Eliminar el país
            em.remove(countryToDelete);
        } else {
            System.out.println("El país no existe.");
        }

        // Confirmar la transacción
        em.getTransaction().commit();

        // Cerrar EntityManager
        em.close();
        emf.close();

        System.out.println("Eliminacion Exitosamente.");
    }
}

