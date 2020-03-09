package group.check.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "objects_of_control")
public class ObjectsOfControl extends ProductionControl{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "object_of_control")
    private String objectOfControl;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "objectOfControl")
    private Set<Checks> checks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectOfControl() {
        return objectOfControl;
    }

    public void setObjectOfControl(String objectOfControl) {
        this.objectOfControl = objectOfControl;
    }

    @Override
    public String toString() {
        return "ObjectsOfControl{" +
                "id=" + id +
                ", objectOfControl='" + objectOfControl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectsOfControl)) return false;

        ObjectsOfControl that = (ObjectsOfControl) o;

        if (getId() != that.getId()) return false;
        return getObjectOfControl() != null ? getObjectOfControl().equals(that.getObjectOfControl()) : that.getObjectOfControl() == null;

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getObjectOfControl() != null ? getObjectOfControl().hashCode() : 0);
        return result;
    }
}
