package Service;

import Model.Amostra;
import Model.Medico;
import Model.Produto;
import Model.Repositor;

import java.util.ArrayList;

public class buscas {
    // Busca Médico pelo nome
    public static Medico buscarMedicoPorNome(ArrayList<Medico> medicos, String nomeBusca) {
        for (Medico medico : medicos) {
            if (medico.getNome().equalsIgnoreCase(nomeBusca)) {
                return medico;
            }
        }
        return null;
    }

    // Busca Repositor pelo nome
    public static Repositor buscarRepositorPorNome(ArrayList<Repositor> repositores, String nomeBusca) {
        for (Repositor repositor : repositores) {
            if (repositor.getNome().equalsIgnoreCase(nomeBusca)) {
                return repositor;
            }
        }
        return null;
    }

    // Busca Produto pelo nome
    public static Produto buscarProdutoPorNome(ArrayList<Produto> produtos, String nomeBusca) {
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeBusca)) {
                return produto;
            }
        }
        return null;
    }

    // Busca amostra pelo tipo
    public static Amostra buscaAmostraPorTipo(ArrayList<Amostra> amostras, String tipoBusca){
        for (Amostra amostra : amostras){
            if (amostra.getTipoAmostra().equalsIgnoreCase(tipoBusca)) {
                return amostra;
            }
        }
        return null;
    }
}
