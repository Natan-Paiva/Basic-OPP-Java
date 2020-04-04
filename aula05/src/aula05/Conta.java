package aula05;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-------------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public void abreConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t=="CC"){
            this.saldo=50;
        }else if(t=="CP"){
            this.saldo=150;
        }
        System.out.println("Conta aberta com sucesso.");
        
    }
    public void fechaConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro.");
        }else if(this.getSaldo()<0){
            System.out.println("Conta em debito.");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void depositar(float v){
        if(getStatus()){
            this.setSaldo(getSaldo()+v);
            System.out.println("Deposito realizado na conta de "+this.getDono());
        }else{
            System.out.println("Conta fechada.");
        }
    }
    public void sacar(float v){
        if(getStatus()){
            if(getSaldo()>=v){
                this.setSaldo(getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("Conta fechada.");
        }
    }
    public void pagarMensal(){
        int v=0;
        if(getTipo()=="CC"){
            v=12;
        }else if(getTipo()=="CP"){
            v=20;
        }
        if(getStatus()){
            if(this.getSaldo()>= v){
                setSaldo(getSaldo()-v);
            }else{
                System.out.println("Saldo insuficiente.");
            }
        }else{
            System.out.println("COnta fechada.");
        }
    }
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus() {
        return status;
    }    
    public void setStatus(boolean st) {
        this.status = st;
    }
}

    


//cc 50 cp 150
