package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plant")
public class Plant {

    @Id
    @Column(name = "code_plant")
    private int codePlant;

    @Column(name = "plant_name")
    private String plantName;

    public int getCodePlant() {
        return codePlant;
    }

    public void setCodePlant(int codePlant) {
        this.codePlant = codePlant;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "codePlant=" + codePlant +
                ", plantName='" + plantName + '\'' +
                '}';
    }
}
