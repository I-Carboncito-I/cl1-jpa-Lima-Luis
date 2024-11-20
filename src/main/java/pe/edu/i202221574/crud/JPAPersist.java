package pe.edu.i202221574.crud;

import jakarta.persistence.*;
import pe.edu.i202221574.Clase.CountryLanguageId;
import pe.edu.i202221574.entity.City;
import pe.edu.i202221574.entity.Country;
import pe.edu.i202221574.entity.CountryLanguage;

import java.util.List;

public class JPAPersist {

    public static void main(String[] args) {
        // Crear una instancia de EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1-jpa-Lima-Luis");
        EntityManager em = emf.createEntityManager();

        // Iniciar una transacción
        em.getTransaction().begin();

        // Crear el país Zaralandia
        Country zaralandia = new Country();
        zaralandia.setCode("ZAR");
        zaralandia.setName("Zaralandia");
        zaralandia.setContinent("Zaraterra");
        zaralandia.setRegion("Misteriosa");
        zaralandia.setPopulation(1000000);
        zaralandia.setSurfaceArea(3000.0);
        zaralandia.setIndepYear(1876);
        zaralandia.setLifeExpectancy(75.0);
        zaralandia.setGnp(500000.0);
        zaralandia.setGnpOld(450000.0);
        zaralandia.setLocalName("Zaralandia Real");
        zaralandia.setGovernmentForm("República Mágica");
        zaralandia.setHeadOfState("Zaraguapo el Grande");
        zaralandia.setCapital(1);
        zaralandia.setCode2("ZR");

        // Crear las 3 ciudades
        City city1 = new City();
        city1.setName("Zara City");
        city1.setDistrict("Zara District");
        city1.setPopulation(400000);
        city1.setCountry(zaralandia);

        City city2 = new City();
        city2.setName("Mysticville");
        city2.setDistrict("Mystic District");
        city2.setPopulation(250000);
        city2.setCountry(zaralandia);

        City city3 = new City();
        city3.setName("Fictionland");
        city3.setDistrict("Fiction District");
        city3.setPopulation(350000);
        city3.setCountry(zaralandia);

        zaralandia.setCities(List.of(city1, city2, city3));

        // Crear los 3 lenguajes nativos
        CountryLanguage language1 = new CountryLanguage();
        CountryLanguageId langId1 = new CountryLanguageId();
        langId1.setCountryCode(zaralandia.getCode());
        langId1.setLanguage("Zaralish");
        language1.setId(langId1);
        language1.setIsOfficial(1);
        language1.setPercentage(90.0);
        language1.setCountry(zaralandia);

        CountryLanguage language2 = new CountryLanguage();
        CountryLanguageId langId2 = new CountryLanguageId();
        langId2.setCountryCode(zaralandia.getCode());
        langId2.setLanguage("Mystico");
        language2.setId(langId2);
        language2.setIsOfficial(0);
        language2.setPercentage(5.0);
        language2.setCountry(zaralandia);

        CountryLanguage language3 = new CountryLanguage();
        CountryLanguageId langId3 = new CountryLanguageId();
        langId3.setCountryCode(zaralandia.getCode());
        langId3.setLanguage("Fictionese");
        language3.setId(langId3);
        language3.setIsOfficial(0);
        language3.setPercentage(5.0);
        language3.setCountry(zaralandia);

        zaralandia.setLanguages(List.of(language1, language2, language3));

        // Persistir el país (y sus ciudades y lenguajes) en la base de datos
        em.persist(zaralandia);

        // Confirmar la transacción
        em.getTransaction().commit();

        // Cerrar EntityManager
        em.close();
        emf.close();

        System.out.println("Registro Exitosamente");
    }
}


