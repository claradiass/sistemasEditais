package br.edu.ifpb.esperanca.padroes.editais.service.Professor;

import java.util.List;

import br.edu.ifpb.esperanca.padroes.editais.domain.Notice;
import br.edu.ifpb.esperanca.padroes.editais.facade.FacadeProfessor;

public class ServiceProfessor implements FacadeProfessor {

    @Override
    public boolean login(String userName, String senha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public List<Notice> listarEditais() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarEditais'");
    }

    @Override
    public List<Notice> buscarEdital(String termo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarEdital'");
    }

    @Override
    public void postarEdital() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postarEdital'");
    }

    @Override
    public void removerEdital(int idEdital) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerEdital'");
    }

    @Override
    public void editarEdital(int idEdital) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editarEdital'");
    }
    
}
