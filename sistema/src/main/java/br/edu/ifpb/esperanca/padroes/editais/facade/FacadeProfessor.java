package br.edu.ifpb.esperanca.padroes.editais.facade;

import java.util.List;

import br.edu.ifpb.esperanca.padroes.editais.domain.Notice;

public interface FacadeProfessor implements {
    boolean login(String userName, String senha);
    List<Notice> listarEditais();
    List<Notice> buscarEdital(String termo);
    void postarEdital();
    void removerEdital(int idEdital);
    void editarEdital(int idEdital);
}