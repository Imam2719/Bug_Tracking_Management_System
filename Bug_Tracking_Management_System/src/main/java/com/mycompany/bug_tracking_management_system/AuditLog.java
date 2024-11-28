
package com.mycompany.bug_tracking_management_system;

public class AuditLog {
    private int id;
    private int userId;
    private String action;
    private String details;

    public AuditLog(int id, int userId, String action, String details) {
        this.id = id;
        this.userId = userId;
        this.action = action;
        this.details = details;
    }

    public void logAction() {
        System.out.println("Action logged: " + action + " - " + details);
    }
}
