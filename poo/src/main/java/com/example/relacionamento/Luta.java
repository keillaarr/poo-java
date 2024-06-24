package com.example.relacionamento;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante; 
    private int rounds; 
    private boolean aprovada; 

   public void setDesafiado(Lutador desafiado) {
       this.desafiado = desafiado;
   }
   public Lutador getDesafiado() {
       return desafiado;
   }
   public Lutador getDesafiante() {
       return desafiante;
   }
   public void setDesafiante(Lutador desafiante) {
       this.desafiante = desafiante;
   }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public int getRounds() {
        return rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!= l2 ){
                this.aprovada = true; 
                this.desafiado = l1; 
                this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null; 
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (aprovada){
          System.out.println("### DESAFIADO ###" );
          getDesafiado().apresentar();
          System.out.println("### DESAFIANTE ###");
          getDesafiante().apresentar();

          Random aleatorio = new Random(); 

          int vencedor = aleatorio.nextInt(3); 
          switch (vencedor) {
            case 0 -> {
                System.out.println("Empatou!");
                getDesafiado().empatarLuta();
                getDesafiante().empatarLuta();
                }
            case 1 -> {
                System.out.println(getDesafiado().getNome());
                getDesafiado().ganharLuta();
                getDesafiante().perderLuta();
                }
            case 2 -> {
                System.out.println(getDesafiante().getNome());
                getDesafiante().ganharLuta();
                getDesafiado().perderLuta();
                }
          }
            
        } else {
            System.out.println("Luta não pode acontecer ");
        }

    }
}
