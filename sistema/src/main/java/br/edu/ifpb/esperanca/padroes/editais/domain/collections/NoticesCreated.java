package br.edu.ifpb.esperanca.padroes.editais.domain.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.esperanca.padroes.editais.domain.Notice;


public class NoticesCreated {
    private List<Notice> created;
    
    public NoticesCreated() {
        this.created = new ArrayList<Notice>();
    }
    
    public List<Notice> getCreated() {
        return created;
    }
    
    public void setCreated(List<Notice> created) {
        this.created = created;
    }
}
