package aula05;

public class Aula05 {
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abreConta("CC");
                
        Conta p2 = new Conta();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abreConta("CP");
        
        p1.depositar(300);
        p2.depositar(500);
       
        p2.sacar(100);
        p1.sacar(350);
        p1.fechaConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
