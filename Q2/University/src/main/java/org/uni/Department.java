package org.uni;

import java.util.ArrayList;
import java.util.List;

public class Department {
    //attributes
    private List<Program> programs;
    private String name;

    //constructors
    public Department() {}
    public Department(String name) {
        this.name = name;
        this.programs = new ArrayList<>();
    }

    //methods
    public String getName() {
        return name;
    }
    public void addProgram(Program program) {
        this.programs.add(program);
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void removeProgram(Program program) {
        this.programs.remove(program);
    }


}
