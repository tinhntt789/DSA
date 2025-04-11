
package com.Tinhntt.AssignmentStudent;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n1. Add Student\n2. Edit Student\n3. Delete Student\n4. View Ranking\n5. Search Student\n6. Exit");
            System.out.print("Choose option: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            String id, name;
            double score;

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    try {
                        System.out.print("Enter Score: ");
                        score = Double.parseDouble(sc.nextLine().replace(",", "."));
                        manager.addStudent(id, name, score);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid score input! Please enter a valid number (e.g., 8.5)");
                    }
                    break;
                case 2:
                    System.out.print("Enter ID to edit: ");
                    id = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    try {
                        System.out.print("Enter New Score: ");
                        score = Double.parseDouble(sc.nextLine().replace(",", "."));
                        manager.editStudent(id, name, score);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid score input! Please enter a valid number (e.g., 8.5)");
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextLine();
                    manager.deleteStudent(id);
                    break;
                case 4:
                    manager.viewRanking();
                    break;
                case 5:
                    System.out.print("Enter ID to search: ");
                    id = sc.nextLine();
                    manager.searchStudent(id);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
