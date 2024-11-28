


import com.mycompany.bug_tracking_management_system.Bug;
import com.mycompany.bug_tracking_management_system.Project;
import com.mycompany.bug_tracking_management_system.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class BugTrackingAppTest {

    @Test
    public void testAddUser() {
        List<User> users = new ArrayList<>();
        User user = new User(1, "John Doe", "john.doe@example.com", "Developer", "password123");
        users.add(user);

        assertEquals(1, users.size());
        assertEquals("John Doe", users.get(0).getName());
    }

    @Test
    public void testCreateProject() {
        List<Project> projects = new ArrayList<>();
        Project project = new Project(101, "Bug Tracker", "A project for tracking bugs", "Admin");
        projects.add(project);

        assertEquals(1, projects.size());
        assertEquals("Bug Tracker", projects.get(0).getName());
    }

    @Test
    public void testReportBug() {
        List<Bug> bugs = new ArrayList<>();
        Bug bug = new Bug(201, "NullPointerException", "Occurs when accessing a null object", "High");
        bugs.add(bug);

        assertEquals(1, bugs.size());
        assertEquals("NullPointerException", bugs.get(0).getTitle());
    }

    @Test
    public void testAssignAndUpdateBug() {
        Bug bug = new Bug(201, "NullPointerException", "Occurs when accessing a null object", "High");
        User user = new User(1, "John Doe", "john.doe@example.com", "Developer", "password123");

        bug.assignBug(user);
        bug.updateBugStatus("Resolved");

        assertEquals("Resolved", bug.getStatus());
    }
}
