package com.myproject.mytodo.entities;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private long tId;

    private String tTitle;
    private String tDescription;

    public Task() {
    }

    public Task(String tTitle, String tDescription) {
        this.tTitle = tTitle;
        this.tDescription = tDescription;
    }

    public Task(String tTitle) {
        this.tTitle = tTitle;
    }

    public Task(long tId, String tTitle, String tDescription) {
        this.tId = tId;
        this.tTitle = tTitle;
        this.tDescription = tDescription;
    }

    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    public String gettTitle() {
        return tTitle;
    }

    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    public String getTDescription() {
        return tDescription;
    }

    public void setTDescription(String tDescription) {
        this.tDescription = tDescription;
    }

    @Override
    public String toString() {
        return "Task{" +
                "tId=" + tId +
                ", tTitle='" + tTitle + '\'' +
                ", tDescription='" + tDescription + '\'' +
                '}';
    }
}
