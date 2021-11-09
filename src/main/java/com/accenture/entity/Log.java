package com.accenture.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logs")
public class Log implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
	private Boolean renamed;
    private Boolean moved;
    private int linescount;
    private int linesvalidated;
    private Boolean filecreated;
    private Boolean fileuploaded;
    private Boolean dumpcreated;

    public Log() {
    	renamed = true;
    	linescount = 100;
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

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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



