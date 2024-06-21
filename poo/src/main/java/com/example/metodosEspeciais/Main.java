package com.example.metodosEspeciais;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(); 
        conta1.setNomeCliente("Ana Julia");
        conta1.numConta = 151515; 
        conta1.setTipodeconta("CC");

        conta1.abrirConta();
        conta1.sacar(50);
        conta1.pagarMensalidade();
        conta1.exibirSaldo();   


       

        

    }


}