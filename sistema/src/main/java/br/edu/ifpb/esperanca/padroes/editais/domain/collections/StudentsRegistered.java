package br.edu.ifpb.esperanca.padroes.editais.domain.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.esperanca.padroes.editais.domain.Student;

public class StudentsRegistered {
    private List<Student> StudentsRegistered;

    public StudentsRegistered() {
        this.StudentsRegistered = new ArrayList<>();
    }

    public List<Student> getStudentsRegistered() {
        return StudentsRegistered;
    }

    public void setStudentsRegistered(List<Student> studentsRegistered) {
        StudentsRegistered = studentsRegistered;
    }
    
}
