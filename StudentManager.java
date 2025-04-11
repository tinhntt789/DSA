
package com.Tinhntt.AssignmentStudent;
import java.util.*;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    HashMap<String, Student> studentMap = new HashMap<>();

    public void addStudent(String id, String name, double score) {
        if (studentMap.containsKey(id)) {
            System.out.println("Student ID already exists.");
            return;
        }
        Student s = new Student(id, name, score);
        students.add(s);
        studentMap.put(id, s);
        System.out.println("Student added successfully.");
    }

    public void deleteStudent(String id) {
        Student s = studentMap.remove(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        students.remove(s);
        System.out.println("Student deleted successfully.");
    }

    public void editStudent(String id, String name, double score) {
        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        s.name = name;
        s.score = score;
        System.out.println("Student updated successfully.");
    }

    public void viewRanking() {
        students.sort(Comparator.comparingDouble(stu -> -stu.score));
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(String id) {
        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(s);
        }
    }
}
