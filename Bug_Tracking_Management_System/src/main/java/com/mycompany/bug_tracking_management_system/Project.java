package com.mycompany.bug_tracking_management_system;


import java.util.ArrayList;
import java.util.List;

public class Project {
    private int id;
    private String name;
    private String description;
    private String createdBy;
    private List<Bug> bugs;

    public Project(int id, String name, String description, String createdBy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.bugs = new ArrayList<>();
    }

    public void addBug(Bug bug) {
        bugs.add(bug);
        System.out.println("Bug added to project: " + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public List<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(List<Bug> bugs) {
        this.bugs = bugs;
    }
    
    
}
