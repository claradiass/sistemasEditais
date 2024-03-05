package br.edu.ifpb.esperanca.padroes.editais.domain;

import br.edu.ifpb.esperanca.padroes.editais.domain.collections.StudentsRegistered;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Description;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Title;

public class Notice {
    private Title title;
    private Description description;
    private Professor professor; // Suscetível de ser removido futuramente ou trocar por Name.
    private StudentsRegistered studentsRegistered;
    
    public Notice(Title title, Description description, Professor professor) {
        this.title = title;
        this.description = description;
        this.professor = professor;
        this.studentsRegistered = new StudentsRegistered();
    }
    
    public Title getTitle() {
        return title;
    }
    
    public void setTitle(Title title) {
        this.title = title;
    }
    
    public Description getDescription() {
        return description;
    }
    
    public void setDescription(Description description) {
        this.description = description;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public StudentsRegistered getStudentsRegistered() {
        return studentsRegistered;
    }
}
