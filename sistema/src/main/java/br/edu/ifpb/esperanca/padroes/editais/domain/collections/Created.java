package br.edu.ifpb.esperanca.padroes.editais.domain.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.esperanca.padroes.editais.domain.Notice;


public class Created {
    private List<Notice> created;

    public Created(List<Notice> created) {
        this.created = new ArrayList<Notice>();
    }
}
