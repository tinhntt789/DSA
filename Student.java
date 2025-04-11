
package com.Tinhntt.AssignmentStudent;
public class Student {
    String id;
    String name;
    double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getRank() {
        if (score < 5.0) return "Fail";
        else if (score < 6.5) return "Medium";
        else if (score < 7.5) return "Good";
        else if (score <= 9.0) return "Very Good";
        else return "Excellent";
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + score + " - " + getRank();
    }
}
