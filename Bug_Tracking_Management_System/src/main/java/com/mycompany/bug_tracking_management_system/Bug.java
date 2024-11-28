
package com.mycompany.bug_tracking_management_system;


public class Bug {
    private int id;
    private String title;
    private String description;
    private String severity;
    private String status;

    public Bug(int id, String title, String description, String severity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.severity = severity;
        this.status = "Open";
    }

    public void updateBugStatus(String status) {
        this.status = status;
        System.out.println("Bug status updated to: " + status);
    }

    public void assignBug(User user) {
        System.out.println("Bug assigned to: " + user.getName());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSeverity() {
        return severity;
    }

    public String getStatus() {
        return status;
    }
}
