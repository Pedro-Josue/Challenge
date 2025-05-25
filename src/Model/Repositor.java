package Model;

import java.util.ArrayList;

public class Repositor extends Pessoa{
    private int idRepositor;

    //construtor
    public Repositor(String nome, int idade, String emailCorporativo, int idRepositor) {
        super(nome, idade, emailCorporativo);
        this.idRepositor = idRepositor;
    }
    //getters
    public int getIdRepositor() {
        return idRepositor;
    }
    //setters
    public void setIdRepositor(int idRepositor) {
        this.idRepositor = idRepositor;
    }
    //Metodos

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
    }
    @Override
    public void atualizarEmail(String novoEmail) {
        super.atualizarEmail(novoEmail);
    }

    public void reporProduto(Almoxarifado almoxarifado, Produto produto, int quantidade) {
        almoxarifado.adicionarProduto(produto, quantidade);
        System.out.println("Repositor " + this.getNome() + " repôs " + quantidade + " unidades do produto " + produto.getNomeProduto());
    }

    public void consultarEstoque(Almoxarifado almoxarifado) {
        System.out.println("O repositor" + getNome() + " verificou a quantidade total de produtos no almoxarifado: " + almoxarifado.getQuantidadeProdutos());
    }
}
