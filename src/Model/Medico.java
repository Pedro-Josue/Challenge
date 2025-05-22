package Model;

public class Medico extends Pessoa{
    private int idMedico;
    private String crm;
    private String especialidade;

    //construtor
    public Medico(String nome, int idade, String emailCorporativo, int idMedico, String crm, String especialidade) {
        super(nome, idade, emailCorporativo);
        this.idMedico = idMedico;
        this.crm = crm;
        this.especialidade = especialidade;
    }
    //getters
    public int getIdMedico() {
        return idMedico;
    }
    public String getCrm() {
        return crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    //setters
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
