package Model;

public class Produto{
    private int idProduto;
    private String nomeProduto;
    private String casoUso; //referente a qual o uso específico desse produto para o lab
    private int quantidade;
    private int altura;
    private int largura;
    private String marca;
    private Almoxarifado almoxarifado; //dessa vez referenciando o objeto fora de uma lista, porque um produto pertence a um unico almoxarifado

    //construtor
    public Produto(int idProduto, String nomeProduto, String casoUso, int quantidade, int altura, int largura, String marca, Almoxarifado almoxarifado) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.casoUso = casoUso;
        this.quantidade = quantidade;
        this.altura = altura;
        this.largura = largura;
        this.marca = marca;
        this.almoxarifado = almoxarifado;
    }
    //getters
    public int getIdProduto() {
        return idProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public String getCasoUso() {
        return casoUso;
    }
    public int getQuantidade() {
        return quantidade;
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
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setCasoUso(String casoUso) {
        this.casoUso = casoUso;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
    //Metodos
    public void verificarEstoque(int quantidadeDesejada) {
        if (this.quantidade >= quantidadeDesejada) {
            System.out.println("Estoque suficiente para " + quantidadeDesejada + " unidades do produto " + this.nomeProduto);
        } else {
            System.out.println("Estoque insuficiente. Disponível: " + this.quantidade + " unidades do produto " + this.nomeProduto);
        }
    }

}
