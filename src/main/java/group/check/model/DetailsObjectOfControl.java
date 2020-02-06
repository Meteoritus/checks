package group.check.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "details_object_of_control")
public class DetailsObjectOfControl extends ProductionControl{

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "detail_object_of_control")
    private String detailObjectOfControl;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detailsObjectOfControl")
    private Set<Checks> checks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetailObjectOfControl() {
        return detailObjectOfControl;
    }

    public void setDetailObjectOfControl(String detailObjectOfControl) {
        this.detailObjectOfControl = detailObjectOfControl;
    }

    @Override
    public String toString() {
        return "DetailsObjectOfControl{" +
                "id=" + id +
                ", detailObjectOfControl='" + detailObjectOfControl + '\'' +
                '}';
    }
}
