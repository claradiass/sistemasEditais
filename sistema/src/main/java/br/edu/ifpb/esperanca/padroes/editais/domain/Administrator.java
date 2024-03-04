package br.edu.ifpb.esperanca.padroes.editais.domain;

import br.edu.ifpb.esperanca.padroes.editais.domain.models.Name;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Password;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.UserName;

public class Administrator extends User{
    public Administrator(Name name, Password password, UserName userName) {
        super(name, password, userName);
    }
}