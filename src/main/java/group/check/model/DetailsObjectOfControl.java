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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetailsObjectOfControl)) return false;

        DetailsObjectOfControl that = (DetailsObjectOfControl) o;

        if (getId() != that.getId()) return false;
        return getDetailObjectOfControl() != null ? getDetailObjectOfControl().equals(that.getDetailObjectOfControl()) : that.getDetailObjectOfControl() == null;

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getDetailObjectOfControl() != null ? getDetailObjectOfControl().hashCode() : 0);
        return result;
    }
}
