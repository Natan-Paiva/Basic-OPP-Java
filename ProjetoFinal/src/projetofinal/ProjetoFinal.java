package projetofinal;

public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[]=new Video[3];
        
        v[0]= new Video("Aula POO 1");
        v[1]= new Video("Aula POO 2");
        v[2]= new Video("Aula POO 3");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu",22,"M","jubas");
        g[1] = new Gafanhoto("Creuza",12,"F","creuzita");
        
        Visualicao vis[]= new Visualicao[4];
        vis[0] = new Visualicao(g[0],v[1]);
        vis[0].avaliar();
        
        vis[1] = new Visualicao(g[1],v[1]);
        //System.out.println(v[1].toString());
        vis[1].avaliar(3);
        //System.out.println(g[0].toString());
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
    
}
