
package com.mycompany.bug_tracking_management_system;

public class Role {
    private int id;
    private String roleName;

    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public void assignRoleToUser(User user, String roleName) {
        user = new User(user.getId(), user.getName(), user.getName() + "@test.com", roleName, "password");
        System.out.println("Assigned role: " + roleName + " to user: " + user.getName());
    }
    
    public int getId() {
        return id;
    }

    // Getter
    public void setId(int id) {    
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }
}
