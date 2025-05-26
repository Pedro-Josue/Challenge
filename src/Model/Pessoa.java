package Model;

public class Pessoa {
    private String nome;
    private String idade;
    private String emailCorporativo;

    //construtor
    public Pessoa(String nome, String idade, String emailCorporativo) {
        this.nome = nome;
        this.idade = idade;
        this.emailCorporativo = emailCorporativo;
    }
    //getters
    public String getNome() {
        return nome;
    }
    public String getIdade() {
        return idade;
    }
    public String getEmailCorporativo() {
        return emailCorporativo;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }
    //métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + emailCorporativo);
    }

    public void atualizarEmail(String novoEmail) {
        this.emailCorporativo = novoEmail;
        System.out.println("Contato atualizado! novo e-mail: " + novoEmail);
    }
}
