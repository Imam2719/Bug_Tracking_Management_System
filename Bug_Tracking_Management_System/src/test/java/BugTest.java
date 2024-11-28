import com.mycompany.bug_tracking_management_system.Bug;
import com.mycompany.bug_tracking_management_system.User;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BugTest {

    @Test
    public void testBugCreation() {
        Bug bug = new Bug(201, "NullPointerException", "Occurs when accessing a null object", "High");

        assertEquals(201, bug.getId());
        assertEquals("NullPointerException", bug.getTitle());
        assertEquals("Occurs when accessing a null object", bug.getDescription());
        assertEquals("High", bug.getSeverity());
        assertEquals("Open", bug.getStatus());
    }

    @Test
    public void testUpdateBugStatus() {
        Bug bug = new Bug(201, "NullPointerException", "Occurs when accessing a null object", "High");
        bug.updateBugStatus("Resolved");

        assertEquals("Resolved", bug.getStatus());
    }

    @Test
    public void testAssignBug() {
        Bug bug = new Bug(201, "NullPointerException", "Occurs when accessing a null object", "High");
        User user = new User(1, "John Doe", "john.doe@example.com", "Developer", "password123");

        bug.assignBug(user);
        // No exceptions indicate successful assignment.
    }
}
