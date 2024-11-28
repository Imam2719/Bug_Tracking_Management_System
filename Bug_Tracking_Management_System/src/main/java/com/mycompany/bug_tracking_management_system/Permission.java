
package com.mycompany.bug_tracking_management_system;

public class Permission {
    private int id;
    private int roleId;
    private String resource; // e.g., "Bug", "Project"
    private String action; // e.g., "Create", "Read", "Update", "Delete"

    public Permission(int id, int roleId, String resource, String action) {
        this.id = id;
        this.roleId = roleId;
        this.resource = resource;
        this.action = action;
    }

    public void assignPermission(Role role, String resource, String action) {
        System.out.println("Assigned " + action + " permission on " + resource + " to role: " + role.getRoleName());
    }

    public boolean checkPermission(int roleId, String resource, String action) {
        // Logic to check permission
        return true; // Simplified for demonstration
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}

