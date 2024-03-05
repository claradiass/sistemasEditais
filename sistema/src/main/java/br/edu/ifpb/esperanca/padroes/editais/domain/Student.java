package br.edu.ifpb.esperanca.padroes.editais.domain;

import br.edu.ifpb.esperanca.padroes.editais.domain.collections.NoticesRegistered;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Name;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Password;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.UserName;

public class Student extends User{
    private NoticesRegistered registeredNotices;
    
    public Student(Name name, Password password, UserName userName) {
        super(name, password, userName);
        this.registeredNotices = new NoticesRegistered(); 
    } 

    public NoticesRegistered getRegisteredNotices() {
        return registeredNotices;
    }
}
