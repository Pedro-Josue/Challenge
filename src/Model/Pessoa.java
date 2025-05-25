package Model;

public class Pessoa {
    private String nome;
    private int idade;
    private String emailCorporativo;

    //construtor
    public Pessoa(String nome, int idade, String emailCorporativo) {
        this.nome = nome;
        this.idade = idade;
        this.emailCorporativo = emailCorporativo;
    }
    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getEmailCorporativo() {
        return emailCorporativo;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
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
