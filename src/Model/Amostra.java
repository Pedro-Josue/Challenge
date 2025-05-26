package Model;

import java.util.Date;

public class Amostra{
    private int idAmostra;
    private String tipoAmostra;
    private Date dataColeta;
    private String nivelPrioridade;
    private Laboratorio laboratorio; //fk para laboratorio
    private Medico medico;

    //construtor
    public Amostra(int idAmostra, String tipoAmostra, Date dataColeta, String nivelPrioridade, Laboratorio laboratorio, Medico medico) {
        this.idAmostra = idAmostra;
        this.tipoAmostra = tipoAmostra;
        this.dataColeta = dataColeta;
        this.nivelPrioridade = nivelPrioridade;
        this.laboratorio = laboratorio;
        this.medico = medico;
    }
    //getters
    public int getIdAmostra() {
        return idAmostra;
    }
    public String getTipoAmostra() {
        return tipoAmostra;
    }
    public Date getDataColeta() {
        return dataColeta;
    }
    public String getNivelPrioridade() {
        return nivelPrioridade;
    }
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
    public Medico getMedico() {
        return medico;
    }
    //setters
    public void setIdAmostra(int idAmostra) {
        this.idAmostra = idAmostra;
    }
    public void setTipoAmostra(String tipoAmostra) {
        this.tipoAmostra = tipoAmostra;
    }
    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }
    public void setNivelPrioridade(String nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }
    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    //Metodos
    public void registrarColeta(Date data, int idAmostra) {
        this.dataColeta = data;
        this.idAmostra = idAmostra;
        System.out.println("Coleta registrada em " + data + " com ID: " + getIdAmostra());
    }
    public void verificarValidade() {
        if (this.dataColeta == null) {
            System.out.println("Amostra não possui data de coleta registrada.");
        } else {
            System.out.println("Amostra coletada em " + this.dataColeta + " está válida para análise.");
        }
    }

}
