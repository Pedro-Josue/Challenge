package Model;

public class Medico extends Pessoa{
    private int idMedico;
    private String crm;
    private String especialidade;

    //construtor
    public Medico(String nome, String idade, String emailCorporativo, int idMedico, String crm, String especialidade) {
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
    //Metodos
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }
    @Override
    public void atualizarEmail(String novoEmail) {
        super.atualizarEmail(novoEmail);
    }

    public void solicitarExame(Amostra amostra) {
        System.out.println("Médico " + this.getNome() + " solicitou exame para a amostra de tipo: " + amostra.getTipoAmostra());
    }

    public void emitirDiagnostico(Amostra amostra) {
        System.out.println("Médico " + this.getNome() + " emitiu diagnóstico baseado na amostra de tipo: " + amostra.getTipoAmostra());
    }

}
