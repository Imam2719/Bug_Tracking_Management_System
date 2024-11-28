

import com.mycompany.bug_tracking_management_system.Project;
import org.junit.Test;
import static org.junit.Assert.assertEquals;




public class ProjectTest {

    @Test
    public void testProjectCreation() {
        Project project = new Project(101, "Bug Tracker", "A project for tracking bugs", "Admin");

        assertEquals(101, project.getId());
        assertEquals("Bug Tracker", project.getName());
        assertEquals("A project for tracking bugs", project.getDescription());
        assertEquals("Admin", project.getCreatedBy());
    }

    @Test
    public void testSetters() {
        Project project = new Project(101, "Bug Tracker", "A project for tracking bugs", "Admin");
        project.setName("Issue Tracker");
        project.setDescription("A new description");

        assertEquals("Issue Tracker", project.getName());
        assertEquals("A new description", project.getDescription());
    }
}


