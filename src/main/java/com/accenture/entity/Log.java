package com.accenture.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="logs")
public class Log implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int clave;//clave primaria
    private Boolean renamed;
    private Boolean moved;
    private int linescount;
    private int linesvalidated;
    private Boolean filecreated;
    private Boolean fileuploaded;
    private Boolean dumpcreated;

    public Log() {
    }

    public Log( Boolean renamed, Boolean moved, int linescount, int linesvalidated, Boolean filecreated, Boolean fileuploaded, Boolean dumpcreated) {

        this.renamed = renamed;
        this.moved = moved;
        this.linescount = linescount;
        this.linesvalidated = linesvalidated;
        this.filecreated = filecreated;
        this.fileuploaded = fileuploaded;
        this.dumpcreated = dumpcreated;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Boolean getRenamed() {
        return renamed;
    }

    public void setRenamed(Boolean renamed) {
        this.renamed = renamed;
    }

    public Boolean getMoved() {
        return moved;
    }

    public void setMoved(Boolean moved) {
        this.moved = moved;
    }

    public int getLinescount() {
        return linescount;
    }

    public void setLinescount(int linescount) {
        this.linescount = linescount;
    }

    public int getLinesvalidated() {
        return linesvalidated;
    }

    public void setLinesvalidated(int linesvalidated) {
        this.linesvalidated = linesvalidated;
    }

    public Boolean getFilecreated() {
        return filecreated;
    }

    public void setFilecreated(Boolean filecreated) {
        this.filecreated = filecreated;
    }

    public Boolean getFileuploaded() {
        return fileuploaded;
    }

    public void setFileuploaded(Boolean fileuploaded) {
        this.fileuploaded = fileuploaded;
    }

    public Boolean getDumpcreated() {
        return dumpcreated;
    }

    public void setDumpcreated(Boolean dumpcreated) {
        this.dumpcreated = dumpcreated;
    }

    @Override
    public String toString() {
        return "Log{" +
                "clave=" + clave +
                ", renamed=" + renamed +
                ", moved=" + moved +
                ", linescount=" + linescount +
                ", linesvalidated=" + linesvalidated +
                ", filecreated=" + filecreated +
                ", fileuploaded=" + fileuploaded +
                ", dumpcreated=" + dumpcreated +
                '}';
    }
}



