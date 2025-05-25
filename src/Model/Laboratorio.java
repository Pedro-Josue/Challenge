package Model;

public class Laboratorio {
    private int idLaboratorio;
    private String cep;
    private int quantidadeAmostras;
    private String tipoLaboratorio;
    private Almoxarifado almoxarifado;

    //construtor
    public Laboratorio(int idLaboratorio, String cep, int quantidadeAmostras, String tipoLaboratorio, Almoxarifado almoxarifado) {
        this.idLaboratorio = idLaboratorio;
        this.cep = cep;
        this.quantidadeAmostras = quantidadeAmostras;
        this.tipoLaboratorio = tipoLaboratorio;
        this.almoxarifado = almoxarifado;
    }
    //getters
    public int getIdLaboratorio() {
        return idLaboratorio;
    }
    public String getCep() {
        return cep;
    }
    public int getQuantidadeAmostras() {
        return quantidadeAmostras;
    }
    public String getTipoLaboratorio() {
        return tipoLaboratorio;
    }
    public Almoxarifado getAlmoxarifado() {
        return almoxarifado;
    }
    //setters
    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setQuantidadeAmostras(int quantidadeAmostras) {
        this.quantidadeAmostras = quantidadeAmostras;
    }
    public void setTipoLaboratorio(String tipoLaboratorio) {
        this.tipoLaboratorio = tipoLaboratorio;
    }
    public void setAlmoxarifado(Almoxarifado almoxarifado) {
        this.almoxarifado = almoxarifado;
    }
    //Metodos

}
