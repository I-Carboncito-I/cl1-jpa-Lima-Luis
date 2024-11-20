package pe.edu.i202221574.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "Code")
    private String code; // Clave primaria

    @Column(name = "Name")
    private String name;

    @Column(name = "Continent")
    private String continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private double surfaceArea;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population")
    private int population;

    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "GNPOld")
    private Double gnpOld;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital; // ID de la ciudad capital

    @Column(name = "Code2")
    private String code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cities;  // Relación bidireccional con City

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CountryLanguage> languages; // Relación bidireccional con CountryLanguage

    // Constructores, getters y setters

    public Country() {
    }

    public Country(String code, String name, String continent, String region, double surfaceArea, Integer indepYear,
                   int population, Double lifeExpectancy, Double gnp, Double gnpOld, String localName,
                   String governmentForm, String headOfState, Integer capital, String code2, List<City> cities,
                   List<CountryLanguage> languages) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
        this.cities = cities;
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                '}';
    }

    // Getters and setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContinent() { return continent; }
    public void setContinent(String continent) { this.continent = continent; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public double getSurfaceArea() { return surfaceArea; }
    public void setSurfaceArea(double surfaceArea) { this.surfaceArea = surfaceArea; }

    public Integer getIndepYear() { return indepYear; }
    public void setIndepYear(Integer indepYear) { this.indepYear = indepYear; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public Double getLifeExpectancy() { return lifeExpectancy; }
    public void setLifeExpectancy(Double lifeExpectancy) { this.lifeExpectancy = lifeExpectancy; }

    public Double getGnp() { return gnp; }
    public void setGnp(Double gnp) { this.gnp = gnp; }

    public Double getGnpOld() { return gnpOld; }
    public void setGnpOld(Double gnpOld) { this.gnpOld = gnpOld; }

    public String getLocalName() { return localName; }
    public void setLocalName(String localName) { this.localName = localName; }

    public String getGovernmentForm() { return governmentForm; }
    public void setGovernmentForm(String governmentForm) { this.governmentForm = governmentForm; }

    public String getHeadOfState() { return headOfState; }
    public void setHeadOfState(String headOfState) { this.headOfState = headOfState; }

    public Integer getCapital() { return capital; }
    public void setCapital(Integer capital) { this.capital = capital; }

    public String getCode2() { return code2; }
    public void setCode2(String code2) { this.code2 = code2; }

    public List<City> getCities() { return cities; }
    public void setCities(List<City> cities) { this.cities = cities; }

    public List<CountryLanguage> getLanguages() { return languages; }
    public void setLanguages(List<CountryLanguage> languages) { this.languages = languages; }
}


