package br.edu.ifpb.esperanca.padroes.editais.models;

public class User {
    private String name;
    private String password;
    private String userName;
    
    public User(String name, String password, String userName) {
        this.name = name;
        this.password = password;
        this.userName = userName;
    }
}
