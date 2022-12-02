package model;

import java.util.ArrayList;

public class Teams {
    public Teams(ArrayList<Students> students, String name) {
        this.students = students;
        this.name = name;
    }

    ArrayList<Students> students;

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}