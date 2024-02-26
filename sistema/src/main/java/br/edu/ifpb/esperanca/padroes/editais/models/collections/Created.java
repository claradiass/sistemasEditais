package br.edu.ifpb.esperanca.padroes.editais.models.collections;

import java.util.ArrayList;
import java.util.List;
import br.edu.ifpb.esperanca.padroes.editais.models.Notice;


public class Created {
    private List<Notice> created;

    public Created(List<Notice> created) {
        this.created = new ArrayList<Notice>();
    }
}
