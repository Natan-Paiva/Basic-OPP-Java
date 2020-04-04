package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado,desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria()==l2.getCategoria() && l1!=l2){
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public void lutar(){
        if(aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio=new Random();
            int vencedor = aleatorio.nextInt(3) ;
            System.out.println("=================================");
            switch(vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria de "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderrLuta();
                    break;
                case 2:
                    System.out.println("Vitoria de "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderrLuta();
                    break;
            }
            System.out.println("======================================");
        }else{
            System.out.println("Luta não poode ocorrer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador d) {
        this.desafiado = d;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }
    
}
