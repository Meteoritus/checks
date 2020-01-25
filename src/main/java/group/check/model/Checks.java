package group.check.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "checks")
public class Checks extends ProductionControl {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "code_plant")
    private Plant plant;

    @Column(name = "check_date")
    private Date checkDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_inspector", nullable = false)
    private Employee inspector;

    @Column(name = "check_list")
    private String checkList;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_object_of_control")
    private ObjectsOfControl objectOfControl;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detail_object_of_control", nullable = false)
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

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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

/*    public int getCodePlant() {
        return codePlant;
    }

    public void setCodePlant(int codePlant) {
        this.codePlant = codePlant;
    }*/

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

/*    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
    }*/

    public String getCheckList() {
        return checkList;
    }

    public void setCheckList(String checkList) {
        this.checkList = checkList;
    }

/*    public int getIdObjectOfControl() {
        return idObjectOfControl;
    }

    public void setIdObjectOfControl(int idObjectOfControl) {
        this.idObjectOfControl = idObjectOfControl;
    }

    public int getIdDetailObjectOfControl() {
        return idDetailObjectOfControl;
    }

    public void setIdDetailObjectOfControl(int idDetailObjectOfControl) {
        this.idDetailObjectOfControl = idDetailObjectOfControl;
    }*/

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

/*    public int getIdExecutor() {
        return idExecutor;
    }

    public void setIdExecutor(int idExecutor) {
        this.idExecutor = idExecutor;
    }*/

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
}
