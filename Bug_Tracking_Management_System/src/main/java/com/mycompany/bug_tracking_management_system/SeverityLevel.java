
package com.mycompany.bug_tracking_management_system;

public class SeverityLevel {
    private int id;
    private String levelName;

    public SeverityLevel(int id, String levelName) {
        this.id = id;
        this.levelName = levelName;
    }

    public void assignSeverity(Bug bug, String severity) {
        bug.updateBugStatus(severity);
    }
}
