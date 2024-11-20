package pe.edu.i202221574.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK autogenerada
    @Column(name = "ID")
    private int id; // Clave primaria

    @Column(name = "Name")
    private String name;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private int population;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    private Country country; // Relación con Country

    // Constructores, getters y setters

    public City() {
    }

    public City(String name, String district, int population, Country country) {
        this.name = name;
        this.district = district;
        this.population = population;
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }
}




