package br.edu.ifpb.esperanca.padroes.editais.facade;

import java.util.List;

public interface FacadeStudent {
    boolean login(String userName, String senha);
    List<String> listarEditais();
    void inscreverNoEdital();
}
