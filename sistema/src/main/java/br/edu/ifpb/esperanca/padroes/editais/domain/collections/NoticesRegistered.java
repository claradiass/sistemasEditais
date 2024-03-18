package br.edu.ifpb.esperanca.padroes.editais.domain.collections;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.esperanca.padroes.editais.domain.Notice;

public class NoticesRegistered {
    private List<Notice> registeredNotices;
    
    public NoticesRegistered() {
        this.registeredNotices = new ArrayList<>();
    }
    
    public List<Notice> getRegisteredNotices() {
        return registeredNotices;
    }

    public void setRegisteredNotices(List<Notice> registeredNotices) {
        this.registeredNotices = registeredNotices;
    }
}
