package model;


import javax.persistence.*;

@Entity
@Table(name = "objects_of_control")
public class ObjectsOfControl {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "object_of_control")
    private String objectOfControl;

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
}
