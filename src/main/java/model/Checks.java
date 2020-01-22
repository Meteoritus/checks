package model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "checks")
public class Checks {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "check_date")
    private Date checkDate;

    @Column(name = "id_inspector")
    private int idInspector;

    @Column(name = "check_list")
    private String checkList;

    @Column(name = "id_object_of_control")
    private int idObjectOfControl;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detail_object_of_control", nullable = false)
    private int idDetailObjectOfControl;

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

    @Column(name = "id_executor")
    private int idExecutor;

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

    public int getIdInspector() {
        return idInspector;
    }

    public void setIdInspector(int idInspector) {
        this.idInspector = idInspector;
    }

    public String getCheckList() {
        return checkList;
    }

    public void setCheckList(String checkList) {
        this.checkList = checkList;
    }

    public int getIdObjectOfControl() {
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

    public int getIdExecutor() {
        return idExecutor;
    }

    public void setIdExecutor(int idExecutor) {
        this.idExecutor = idExecutor;
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

    @Override
    public String toString() {
        return "Checks{" +
                "id=" + id +
                ", checkDate=" + checkDate +
                ", idInspector=" + idInspector +
                ", checkList='" + checkList + '\'' +
                ", idObjectOfControl=" + idObjectOfControl +
                ", idDetailObjectOfControl=" + idDetailObjectOfControl +
                ", commentCheck='" + commentCheck + '\'' +
                ", repeatedViolation=" + repeatedViolation +
                ", events='" + events + '\'' +
                ", photoBefore='" + photoBefore + '\'' +
                ", termOfElimination=" + termOfElimination +
                ", idExecutor=" + idExecutor +
                ", photoAfter='" + photoAfter + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
