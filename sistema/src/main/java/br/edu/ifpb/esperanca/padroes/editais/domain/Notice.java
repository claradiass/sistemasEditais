package br.edu.ifpb.esperanca.padroes.editais.domain;

public class Notice {
    private String title;
    private String description;
    private Professor professor;

    public Notice(String title, String description, Professor professor) {
        this.title = title;
        this.description = description;
        this.professor = professor;
    }
}