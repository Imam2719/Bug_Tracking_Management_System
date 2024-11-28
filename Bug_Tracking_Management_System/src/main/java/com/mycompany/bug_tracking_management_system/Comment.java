
package com.mycompany.bug_tracking_management_system;

public class Comment {
    private int id;
    private int bugId;
    private int userId;
    private String commentText;

    public Comment(int id, int bugId, int userId, String commentText) {
        this.id = id;
        this.bugId = bugId;
        this.userId = userId;
        this.commentText = commentText;
    }

    public void addComment() {
        System.out.println("Comment added: " + commentText);
    }
}
