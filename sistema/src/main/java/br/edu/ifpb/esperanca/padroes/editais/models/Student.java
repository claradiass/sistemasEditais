package br.edu.ifpb.esperanca.padroes.editais.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private List<Notice> notices;

    public Student(String name, String password, String userName) {
        super(name, password, userName);
        this.notices = new ArrayList<Notice>();

    } 
}
