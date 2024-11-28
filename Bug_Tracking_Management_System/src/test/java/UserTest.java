

import com.mycompany.bug_tracking_management_system.User;

import org.junit.Test;
import static org.junit.Assert.assertEquals;





public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User(1, "John Doe", "john.doe@example.com", "Developer", "password123");

        assertEquals(1, user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("Developer", user.getRole());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testSetters() {
        User user = new User(1, "John Doe", "john.doe@example.com", "Developer", "password123");
        user.setName("Jane Doe");
        user.setRole("Tester");

        assertEquals("Jane Doe", user.getName());
        assertEquals("Tester", user.getRole());
    }
}
