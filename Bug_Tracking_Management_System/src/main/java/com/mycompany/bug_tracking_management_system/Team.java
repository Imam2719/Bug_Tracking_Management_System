
package com.mycompany.bug_tracking_management_system;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String name;
    private List<User> members;

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(User user) {
        members.add(user);
        System.out.println("Added member: " + user.getName() + " to team: " + name);
    }

    public void removeMember(User user) {
        members.remove(user);
        System.out.println("Removed member: " + user.getName() + " from team: " + name);
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

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
    
    
}

