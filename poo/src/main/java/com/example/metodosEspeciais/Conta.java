package com.example.metodosEspeciais;
public class Conta {
    private static String tipoDeConta = null;
    private String nomeCliente; 
    public int numConta; 
    private float saldo; 
    private boolean status = false;
    private boolean debito = false; 
    protected class tipoDeConta {
        static String[] tipoConta = {"CC", "CP"};
    }

    public Conta(){
        this.saldo = 0; 
        this.setStatus(false); 
    }
    public void abrirConta(){
        this.status = true; 

        if (Conta.tipoDeConta == "CC"){   
            this.setSaldo(50); 
        } else {
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo()<=0){
            System.out.println("""
                    Não é possível fechar conta, verifique se seu saldo está zerado ou se não tem nenhum débito"
                    """);
        }
    }

    public void exibirSaldo(){
        System.out.println("******* SALDO ******* ");
        System.out.println("Nome: "+this.getNomeCliente());
        System.out.println("N° de Conta: "+this.getNunConta());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("Debito: "+this.getDebito());

    }

    public void depositar(float valor){
        this.setSaldo(this.getSaldo()+valor); 
        System.out.println("Seu novo saldo é: "+this.getSaldo());
    }

    public void sacar(float val){ 
        if (this.getSaldo()< val){
            System.out.println("******* Saldo Insuficiente para Transferencia ******* ");
            } else { 
            this.setSaldo(getSaldo() - val);
            }
    }
    public void pagarMensalidade(){
        
        if  (Conta.tipoDeConta == "CC"){
                if (this.getSaldo() < 12){
                    System.out.println("Sem Saldo para pagar Mensalidade ! Procure o Gerente");
                    this.setDebito(true); 
                } else {
                this.setSaldo(getSaldo() - 12);
                }
            
        } else {
                if (this.saldo < 20){
                    System.out.println("Sem Saldo para pagar Mensalidade ! Procure o Gerente");
                    this.setDebito(true);
                
                } else {
                    this.setSaldo(getSaldo() - 20);
                }
        }

    }
 
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }public int getNunConta() {
        return numConta;
    }
    public void setnumConta(int numConta) {
        this.numConta = numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public static String getTipodeconta() {
        return tipoDeConta;
    }
    public void setTipodeconta(String tipoDeConta) {
        Conta.tipoDeConta = tipoDeConta;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getDebito(){
        return this.debito;
    }
    public void setDebito(boolean debito){
        this.debito = debito;
    }

}
