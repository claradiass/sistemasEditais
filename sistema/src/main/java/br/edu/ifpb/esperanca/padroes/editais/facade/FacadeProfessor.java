package br.edu.ifpb.esperanca.padroes.editais.facade;

import java.util.List;

public interface FacadeProfessor {
    boolean login(String userName, String senha);
    List<Edital> listarEditais();
    List<Edital> buscarEdital(String termo);
    void postarEdital();
    void removerEdital(int idEdital);
    void editarEdital(int idEdital);
}
