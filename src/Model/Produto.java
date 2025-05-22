package Model;

public class Produto {
    private int idProduto;
    private String casoUso; //referente a qual o uso específico desse produto para o lab
    private int quantidadeIdeal;
    private int altura;
    private int largura;
    private String marca;
    private Almoxarifado almoxarifado; //dessa vez referenciando o objeto fora de uma lista, porque um produto pertence a um unico almoxarifado

    //construtor
    public Produto(int idProduto, String casoUso, int quantidadeIdeal, int altura, int largura, String marca, Almoxarifado almoxarifado) {
        this.idProduto = idProduto;
        this.casoUso = casoUso;
        this.quantidadeIdeal = quantidadeIdeal;
        this.altura = altura;
        this.largura = largura;
        this.marca = marca;
        this.almoxarifado = almoxarifado;
    }
    //getters
    public int getIdProduto() {
        return idProduto;
    }
    public String getCasoUso() {
        return casoUso;
    }
    public int getQuantidadeIdeal() {
        return quantidadeIdeal;
    }
    public int getAltura() {
        return altura;
    }
    public int getLargura() {
        return largura;
    }
    public String getMarca() {
        return marca;
    }
    public Almoxarifado getAlmoxarifado() {
        return almoxarifado;
    }
    //setters
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public void setCasoUso(String casoUso) {
        this.casoUso = casoUso;
    }
    public void setQuantidadeIdeal(int quantidadeIdeal) {
        this.quantidadeIdeal = quantidadeIdeal;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado = almoxarifado;
    }
}
