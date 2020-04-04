package aula09;

public class Pessoa {
    private String nome,sexo;
    private int idade;
    
    public void fazAniversario(){
        this.setIdade(this.getIdade()+1);
    }

    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.sexo = s;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }
    
    
}
