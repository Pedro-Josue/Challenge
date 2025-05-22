package Model;

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
}
