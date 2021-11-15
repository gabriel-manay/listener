package com.accenture.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="log")
public class Log implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
	private String fileName;
	private Date processDate;
	private Boolean renamed;
    private Boolean moved;
    private long fileLength;
    private int linesvalidated;
    private Boolean filecreated;
    private Boolean fileuploaded;
    private Boolean dumpcreated;

    public Log() {
    	renamed = false;
    	moved = false;
    	filecreated = false;
    	fileuploaded = false;
    	dumpcreated = false;
    	fileLength = 0;
    	linesvalidated = 0;
    }

    public Log( Boolean renamed, Boolean moved, int linescount, int linesvalidated, Boolean filecreated, Boolean fileuploaded, Boolean dumpcreated) {

        this.renamed = renamed;
        this.moved = moved;
        this.fileLength = linescount;
        this.linesvalidated = linesvalidated;
        this.filecreated = filecreated;
        this.fileuploaded = fileuploaded;
        this.dumpcreated = dumpcreated;
    }
    
    public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
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

    public long getFileLength() {
        return fileLength;
    }

    public void setFileLength(long linescount) {
        this.fileLength = linescount;
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
                ", linescount=" + fileLength +
                ", linesvalidated=" + linesvalidated +
                ", filecreated=" + filecreated +
                ", fileuploaded=" + fileuploaded +
                ", dumpcreated=" + dumpcreated +
                '}';
    }
}



