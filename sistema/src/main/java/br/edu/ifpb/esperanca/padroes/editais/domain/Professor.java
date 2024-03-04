package br.edu.ifpb.esperanca.padroes.editais.domain;

import java.util.List;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Name;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Password;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.UserName;

public class Professor extends User{

    public Professor(Name name, Password password, UserName userName) {
        super(name, password, userName);
    }

    public List<Notice> listarEditais(){

    }
    
}
