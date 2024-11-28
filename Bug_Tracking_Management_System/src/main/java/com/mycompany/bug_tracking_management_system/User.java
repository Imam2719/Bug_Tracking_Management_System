package com.mycompany.bug_tracking_management_system;

public class User {
    public int id;
    public String name;
    public String email;
    public String role;
    public String password;

    public User(int id, String name, String email, String role, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful for: " + name);
            return true;
        }
        System.out.println("Invalid credentials.");
        return false;
    }

    public void logout() {
        System.out.println("User logged out: " + name);
    }

    // Getters and Setters

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
