package projetofinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssis;

    public Gafanhoto(String nome, int idade, String sexo,String login) {
        super(nome,idade,sexo);
        this.login = login;
        this.totAssis=0;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssis() {
        return totAssis;
    }

    public void setTotAssis(int totAssis) {
        this.totAssis = totAssis;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login=" + login + ", totAssis=" + totAssis + '}';
    }
    
    
}
