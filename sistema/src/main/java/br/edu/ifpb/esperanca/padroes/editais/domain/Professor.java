package br.edu.ifpb.esperanca.padroes.editais.domain;

import br.edu.ifpb.esperanca.padroes.editais.domain.collections.NoticesCreated;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Name;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.Password;
import br.edu.ifpb.esperanca.padroes.editais.domain.models.UserName;

public class Professor extends User{
    private NoticesCreated noticesCreated;

    public Professor(Name name, Password password, UserName userName) {
        super(name, password, userName);
        this.noticesCreated = new NoticesCreated();
    }

    public NoticesCreated getNoticesCreated() {
        return noticesCreated;
    }
}
