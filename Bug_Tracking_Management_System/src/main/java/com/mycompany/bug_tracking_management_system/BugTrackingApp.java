
package com.mycompany.bug_tracking_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BugTrackingApp {
    private static List<User> users = new ArrayList<>();
    private static List<Project> projects = new ArrayList<>();
    private static List<Bug> bugs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bug Tracking Management System ---");
            System.out.println("1. Add User");
            System.out.println("2. Print All Users");
            System.out.println("3. Create Project");
            System.out.println("4. Report Bug");
            System.out.println("5. Assign Bug");
            System.out.println("6. Update Bug Status");
            System.out.println("7. View All Bugs");
            System.out.println("8. View Closed Bugs");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addUser(scanner);
                    break;
                case 2:
                    printAllUsers();
                    break;
                case 3:
                    createProject(scanner);
                    break;
                case 4:
                    reportBug(scanner);
                    break;
                case 5:
                    assignBug(scanner);
                    break;
                case 6:
                    updateBugStatus(scanner);
                    break;
                case 7:
                    viewAllBugs();
                    break;
                case 8:
                    viewClosedBugs();
                    break;
                case 9:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }

    private static void addUser(Scanner scanner) {
        System.out.print("Enter User ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Role (Admin/QA Tester/Developer): ");
        String role = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        users.add(new User(id, name, email, role, password));
        System.out.println("User added successfully!");
    }

    private static void printAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("\n--- User List ---");
            for (User user : users) {
                System.out.println("ID: " + user.getId() + ", Name: " + user.getName() +
                                   ", Email: " + user.getEmail() + ", Role: " + user.getRole());
            }
        }
    }

    private static void createProject(Scanner scanner) {
        System.out.print("Enter Project ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Project Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Project Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Created By (Name): ");
        String createdBy = scanner.nextLine();

        projects.add(new Project(id, name, description, createdBy));
        System.out.println("Project created successfully!");
    }

    private static void reportBug(Scanner scanner) {
        System.out.print("Enter Bug ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Bug Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Bug Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Bug Severity (Low/Medium/High): ");
        String severity = scanner.nextLine();

        bugs.add(new Bug(id, title, description, severity));
        System.out.println("Bug reported successfully!");
    }

    private static void assignBug(Scanner scanner) {
        System.out.print("Enter Bug ID to Assign: ");
        int bugId = scanner.nextInt();
        System.out.print("Enter User ID to Assign the Bug: ");
        int userId = scanner.nextInt();

        Bug bug = findBugById(bugId);
        User user = findUserById(userId);

        if (bug != null && user != null) {
            bug.assignBug(user);
        } else {
            System.out.println("Bug or User not found.");
        }
    }

    private static void updateBugStatus(Scanner scanner) {
        System.out.print("Enter Bug ID to Update: ");
        int bugId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter New Status (Open/In Progress/Resolved/Closed): ");
        String newStatus = scanner.nextLine();

        Bug bug = findBugById(bugId);
        if (bug != null) {
            bug.updateBugStatus(newStatus);
        } else {
            System.out.println("Bug not found.");
        }
    }

    private static void viewAllBugs() {
        if (bugs.isEmpty()) {
            System.out.println("No bugs reported.");
        } else {
            System.out.println("\n--- Bug List ---");
            for (Bug bug : bugs) {
                System.out.println("ID: " + bug.getId() + ", Title: " + bug.getTitle() +
                                   ", Severity: " + bug.getSeverity() + ", Status: " + bug.getStatus());
            }
        }
    }

    private static void viewClosedBugs() {
        boolean hasClosedBugs = false;
        System.out.println("\n--- Closed Bugs ---");
        for (Bug bug : bugs) {
            if ("Closed".equalsIgnoreCase(bug.getStatus())) {
                System.out.println("ID: " + bug.getId() + ", Title: " + bug.getTitle());
                hasClosedBugs = true;
            }
        }
        if (!hasClosedBugs) {
            System.out.println("No closed bugs found.");
        }
    }

    private static Bug findBugById(int id) {
        for (Bug bug : bugs) {
            if (bug.getId() == id) {
                return bug;
            }
        }
        return null;
    }

    private static User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
