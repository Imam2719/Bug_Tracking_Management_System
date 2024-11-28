package com.mycompany.bug_tracking_management_system;

import java.util.Date;

public class Report {
    private int id;
    private String type; // e.g., "Resolved Bugs", "Unresolved Bugs"
    private String generatedBy;
    private Date generatedDate;

    public Report(int id, String type, String generatedBy) {
        this.id = id;
        this.type = type;
        this.generatedBy = generatedBy;
        this.generatedDate = new Date();
    }

    public void generateReport() {
        System.out.println("Report generated: " + type + " by " + generatedBy);
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Date getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(Date generatedDate) {
        this.generatedDate = generatedDate;
    }
    
}
