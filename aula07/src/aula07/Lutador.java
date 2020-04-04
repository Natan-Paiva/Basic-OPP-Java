package aula07;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade,vitorias, derrotas, empates;
    private float altura,peso;
    
    public void apresentar(){
        System.out.println("------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+" anos e "+this.getAltura() +"cm, pesando "+this.getPeso()+"kg");
        System.out.println("Com "+this.getVitorias()+" vitorias "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates");
    }
    public void status(){
        System.out.println("-------------------------------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Vitorias; "+this.getVitorias());
        System.out.println("Derotas: "+this.getDerrotas());
        System.out.println("Empates; "+this.getEmpates());
        System.out.println("---------------------------------------");
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderrLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }

    public Lutador(String no, String na, int i, float a, float p, int v, int d, int e) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = i;
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
        this.altura = a;
        this.setPeso(p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso<52.2){
            this.categoria="Sem categoria";
        }else if(peso<=79.3){
            this.categoria="Peso Leve";
        }else if(peso<=83.9){
            this.categoria="Peso Medio";
        }else if(peso<=120.2){
            this.categoria="Peso Pesado";
        }else{
            this.categoria="Sem categoria";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int e) {
        this.empates = e;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    
}
