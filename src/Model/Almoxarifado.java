package Model;

import java.util.List;

public class Almoxarifado {
    private int idAlmoxarifado;
    private int quantidadeProdutos;
    private String tipoProdutos;
    private String setor;
    private List<Repositor> repositor;
    //Estou referenciando a classe repositor para conseguir acessar os métodos dela diretamente, funcionando assim como uma FK,
    // no modelo de lista para que seja possivel adicionar mais de um repositor

    //construtor
    public Almoxarifado(int idAlmoxarifado, int quantidadeProdutos, String tipoProdutos, String setor, List<Repositor> repositor) {
        this.idAlmoxarifado = idAlmoxarifado;
        this.quantidadeProdutos = quantidadeProdutos;
        this.tipoProdutos = tipoProdutos;
        this.setor = setor;
        this.repositor = repositor;
    }
    //getters
    public int getIdAlmoxarifado() {
        return idAlmoxarifado;
    }
    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }
    public String getTipoProdutos() {
        return tipoProdutos;
    }
    public String getSetor() {
        return setor;
    }
    public List<Repositor> getRepositor() {
        return repositor;
    }
    //setters
    public void setIdAlmoxarifado(int idAlmoxarifado) {
        this.idAlmoxarifado = idAlmoxarifado;
    }
    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }
    public void setTipoProdutos(String tipoProdutos) {
        this.tipoProdutos = tipoProdutos;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setRepositor(List<Repositor> repositor) {
        this.repositor = repositor;
    }
}
