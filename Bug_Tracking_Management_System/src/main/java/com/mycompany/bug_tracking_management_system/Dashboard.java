/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bug_tracking_management_system;

import java.util.List;

public class Dashboard {
    private int userId;
    private List<Project> projects;
    private List<Bug> bugs;

    public Dashboard(int userId, List<Project> projects, List<Bug> bugs) {
        this.userId = userId;
        this.projects = projects;
        this.bugs = bugs;
    }

    public void viewSummary() {
        System.out.println("Dashboard for User ID: " + userId);
        System.out.println("Projects: ");
        for (Project project : projects) {
            System.out.println(" - " + project.getName());
        }
        System.out.println("Bugs: ");
        for (Bug bug : bugs) {
            System.out.println(" - " + bug.getTitle() + " [" + bug.getStatus() + "]");
        }
    }

    public void filterBugs(String status) {
        System.out.println("Bugs with status: " + status);
        for (Bug bug : bugs) {
            if (bug.getStatus().equals(status)) {
                System.out.println(" - " + bug.getTitle());
            }
        }
    }

    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(List<Bug> bugs) {
        this.bugs = bugs;
    }
    
}

