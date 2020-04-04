package aula09;

public class Livro implements Publicação{
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + "\n totPag=" 
                +totPag + ", pagAtual=" + pagAtual + ", aberto=" 
                + aberto + "\n leitor=" + leitor.getNome() +", idade="+leitor.getIdade()
                +", Sexo=" +leitor.getSexo() +'}';
    }

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.aberto=false;
        this.pagAtual=0;
    }

  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }

    @Override
    public void folhear(int p) {
        if(p<=this.totPag && this.getAberto()){
            this.pagAtual=p;;
        }else{
            this.pagAtual=0;
        }
    }
    
}
