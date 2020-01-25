package group.check.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "plant")
public class Plant extends ProductionControl{

    @Id
    @Column(name = "code_plant")
    private int codePlant;

    @Column(name = "plant_name")
    private String plantName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "plant")
    private Set<Checks> checks;

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
