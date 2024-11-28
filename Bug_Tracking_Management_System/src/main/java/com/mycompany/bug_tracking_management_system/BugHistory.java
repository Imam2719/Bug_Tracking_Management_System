/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bug_tracking_management_system;

import java.util.Date;

public class BugHistory {
    private int id;
    private int bugId;
    private int updatedBy;
    private String oldStatus;
    private String newStatus;
    private Date timestamp;

    public BugHistory(int id, int bugId, int updatedBy, String oldStatus, String newStatus) {
        this.id = id;
        this.bugId = bugId;
        this.updatedBy = updatedBy;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.timestamp = new Date();
    }

    public void recordHistory() {
        System.out.println("Bug ID: " + bugId + " status changed from " + oldStatus + " to " + newStatus + " by User ID: " + updatedBy);
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
}
