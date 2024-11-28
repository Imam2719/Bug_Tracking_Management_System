
package com.mycompany.bug_tracking_management_system;

public class BugStatus {
    private int id;
    private String statusName;

    public BugStatus(int id, String statusName) {
        this.id = id;
        this.statusName = statusName;
    }

    public void changeStatus(Bug bug, String newStatus) {
        bug.updateBugStatus(newStatus);
    }
}
