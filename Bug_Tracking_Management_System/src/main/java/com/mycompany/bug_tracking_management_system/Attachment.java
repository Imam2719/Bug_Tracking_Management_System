package com.mycompany.bug_tracking_management_system;

public class Attachment {
    private int id;
    private int bugId;
    private String filePath;
    private int uploadedBy;

    public Attachment(int id, int bugId, String filePath, int uploadedBy) {
        this.id = id;
        this.bugId = bugId;
        this.filePath = filePath;
        this.uploadedBy = uploadedBy;
    }

    public void addAttachment() {
        System.out.println("Attachment added: " + filePath);
    }
}
