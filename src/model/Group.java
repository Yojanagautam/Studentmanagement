package model;

import java.util.ArrayList;

public class Group {
    public Group(String name, ArrayList<Teams> teams) {
        Name = name;
        this.teams = teams;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Teams> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Teams> teams) {
        this.teams = teams;
    }

    String Name;
    ArrayList<Teams> teams;

}