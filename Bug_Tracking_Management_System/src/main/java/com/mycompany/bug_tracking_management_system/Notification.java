
package com.mycompany.bug_tracking_management_system;

import java.util.Date;

public class Notification {
    private int id;
    private int recipientId;
    private String message;
    private Date timestamp;
    private boolean readStatus;

    public Notification(int id, int recipientId, String message) {
        this.id = id;
        this.recipientId = recipientId;
        this.message = message;
        this.timestamp = new Date();
        this.readStatus = false;
    }

    public void sendNotification() {
        System.out.println("Notification sent to User ID: " + recipientId + " - " + message);
    }

    public void markAsRead() {
        this.readStatus = true;
        System.out.println("Notification marked as read.");
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isReadStatus() {
        return readStatus;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }
    
    
}
