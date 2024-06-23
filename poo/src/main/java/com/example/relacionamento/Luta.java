package com.example.relacionamento;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante; 
    private int rounds; 
    private boolean aprovada; 

    public Luta(){
        setAprovada(false);
    }

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
        if (l1.getCategoria() != l2.getCategoria() && l1 == l2){
            System.out.println("**** Impossível marcar a Luta ! ****");
        } else {
            System.out.println("Luta marcada!");
            setAprovada(true);
        }

    }
    public void lutar(){
        if (aprovada){
            System.out.println("Comecçar Luta !");
            getDesafiado().apresentar();
            
        } else {
            System.out.println("Luta não pode acontecer ");
        }

    }
}
