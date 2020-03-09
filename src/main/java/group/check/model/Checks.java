package group.check.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name = "checks")
public class Checks extends ProductionControl {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "code_plant")
    private Plant plant;

    @Column(name = "check_date")
    private Date checkDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_inspector", nullable = false)
    private Employee inspector;

    @Column(name = "check_list")
    private String checkList;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_object_of_control")
    private ObjectsOfControl objectOfControl;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_detail_object_of_control")
    private DetailsObjectOfControl detailsObjectOfControl;

    @Column(name = "comment_check")
    private String commentCheck;

    @Column(name = "repeated_violation")
    private boolean repeatedViolation;

    @Column(name = "events")
    private String events;

    @Column(name = "photo_before")
    private String photoBefore;

    @Column(name = "term_of_elimination")
    private Date termOfElimination;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_executor", nullable = false)
    private Employee executor;

    @Column(name = "photo_after")
    private String photoAfter;

    @Column(name = "note")
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckList() {
        return checkList;
    }

    public void setCheckList(String checkList) {
        this.checkList = checkList;
    }

    public String getCommentCheck() {
        return commentCheck;
    }

    public void setCommentCheck(String commentCheck) {
        this.commentCheck = commentCheck;
    }

    public boolean isRepeatedViolation() {
        return repeatedViolation;
    }

    public void setRepeatedViolation(boolean repeatedViolation) {
        this.repeatedViolation = repeatedViolation;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getPhotoBefore() {
        return photoBefore;
    }

    public void setPhotoBefore(String photoBefore) {
        this.photoBefore = photoBefore;
    }

    public Date getTermOfElimination() {
        return termOfElimination;
    }

    public void setTermOfElimination(Date termOfElimination) {
        this.termOfElimination = termOfElimination;
    }

    public String getPhotoAfter() {
        return photoAfter;
    }

    public void setPhotoAfter(String photoAfter) {
        this.photoAfter = photoAfter;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Plant getPlant() {
        return plant;
    }

    public Employee getInspector() {
        return inspector;
    }

    public ObjectsOfControl getObjectOfControl() {
        return objectOfControl;
    }

    public DetailsObjectOfControl getDetailsObjectOfControl() {
        return detailsObjectOfControl;
    }

    public Employee getExecutor() {
        return executor;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void setInspector(Employee inspector) {
        this.inspector = inspector;
    }

    public void setObjectOfControl(ObjectsOfControl objectOfControl) {
        this.objectOfControl = objectOfControl;
    }

    public void setDetailsObjectOfControl(DetailsObjectOfControl detailsObjectOfControl) {
        this.detailsObjectOfControl = detailsObjectOfControl;
    }

    public void setExecutor(Employee executor) {
        this.executor = executor;
    }

    @Override
    public String toString() {
        return "Checks{" +
                "id=" + id +
                ", checkDate=" + checkDate +
                ", checkList='" + checkList + '\''  +
                ", commentCheck='" + commentCheck + '\'' +
                ", repeatedViolation=" + repeatedViolation +
                ", events='" + events + '\'' +
                ", photoBefore='" + photoBefore + '\'' +
                ", termOfElimination=" + termOfElimination +
                ", photoAfter='" + photoAfter + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Checks)) return false;

        Checks checks = (Checks) o;

        if (getId() != checks.getId()) return false;
        if (isRepeatedViolation() != checks.isRepeatedViolation()) return false;
        if (!getCheckDate().equals(checks.getCheckDate())) return false;
        if (getCheckList() != null ? !getCheckList().equals(checks.getCheckList()) : checks.getCheckList() != null)
            return false;
        if (!getCommentCheck().equals(checks.getCommentCheck())) return false;
        if (getEvents() != null ? !getEvents().equals(checks.getEvents()) : checks.getEvents() != null) return false;
        if (getPhotoBefore() != null ? !getPhotoBefore().equals(checks.getPhotoBefore()) : checks.getPhotoBefore() != null)
            return false;
        if (!getTermOfElimination().equals(checks.getTermOfElimination())) return false;
        if (getPhotoAfter() != null ? !getPhotoAfter().equals(checks.getPhotoAfter()) : checks.getPhotoAfter() != null)
            return false;
        return getNote() != null ? getNote().equals(checks.getNote()) : checks.getNote() == null;

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getCheckDate().hashCode();
        result = 31 * result + (getCheckList() != null ? getCheckList().hashCode() : 0);
        result = 31 * result + getCommentCheck().hashCode();
        result = 31 * result + (isRepeatedViolation() ? 1 : 0);
        result = 31 * result + (getEvents() != null ? getEvents().hashCode() : 0);
        result = 31 * result + (getPhotoBefore() != null ? getPhotoBefore().hashCode() : 0);
        result = 31 * result + getTermOfElimination().hashCode();
        result = 31 * result + (getPhotoAfter() != null ? getPhotoAfter().hashCode() : 0);
        result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
        return result;
    }
}
