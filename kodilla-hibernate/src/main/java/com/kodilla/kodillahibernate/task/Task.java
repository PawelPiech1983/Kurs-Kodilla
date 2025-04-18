package com.kodilla.kodillahibernate.task;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="TASKS")
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @Column(name="ID", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @Column(name="CREATED", nullable = false)
    public Date getCreated() {
        return created;
    }

    @Column(name="DURATION")
    public int getDuration() {
        return duration;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}
