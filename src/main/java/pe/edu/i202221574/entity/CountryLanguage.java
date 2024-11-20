package pe.edu.i202221574.entity;

import jakarta.persistence.*;
import pe.edu.i202221574.Clase.CountryLanguageId;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id; // Clave primaria compuesta

    @Column(name = "IsOfficial")
    private Integer isOfficial;  // Usamos Integer en lugar de boolean para almacenar 0 o 1

    @Column(name = "Percentage")
    private double percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", insertable = false, updatable = false)
    private Country country; // Relación con Country

    // Constructores, getters y setters

    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguageId id, Integer isOfficial, double percentage, Country country) {
        this.id = id;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "id=" + id +
                ", isOfficial=" + isOfficial +
                ", percentage=" + percentage +
                '}';
    }

    // Getters and setters
    public CountryLanguageId getId() { return id; }
    public void setId(CountryLanguageId id) { this.id = id; }

    public Integer getIsOfficial() { return isOfficial; }
    public void setIsOfficial(Integer isOfficial) { this.isOfficial = isOfficial; }

    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }

    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }
}



