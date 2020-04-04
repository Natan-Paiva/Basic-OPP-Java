package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC","Amerela",0.5f);
        //c1.setModelo("BIC");
        //c1.modelo="BIC";
        //c1.setPonta(0.5f);
        // c1.ponta=0.5f;
        c1.status();
        //System.out.println("Tenho uma caneta "+ c1.getModelo()+ " de ponta "+c1.getPonta());
        Caneta c2= new Caneta("NIC","Laranja",0.7f);
        c2.status();
    }
    
}
