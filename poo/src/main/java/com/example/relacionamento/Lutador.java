package com.example.relacionamento;

public final class Lutador {

   private String nome;
    private String nacionalidade; 
    private int idade;
    private float altura;
    private float peso; 
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates; 

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no; 
        this.nacionalidade = na; 
        this.idade = id; 
        this.altura = al; 
        this.setPeso(pe);
        this.vitorias = vi; 
        this.derrotas = de; 
        this.empates = em;
    }
    //metodos 
   public void apresentar(){
    System.out.println("Chegou de Hora de apresentar O LUTADOR "+getNome());
    System.out.println("Diretamente de: "+getNacionalidade());
    System.out.println(getIdade()+ " Anos e "+getAltura()+ " m");
    System.out.println("Pesando: "+getPeso() +"KG");
    System.out.println(getVitorias()+" Vitorias");
    System.out.println(getDerrotas()+" Derrotas e ");
    System.out.println(getEmpates()+ " Empates");
    }
    public void status(){
        System.out.println("Lutador: "+getNome());
        System.out.println("é um peso "+getCategoria());
        System.out.println("Ganhou: "+ getVitorias()+" vezes");
        System.out.println("Perdeu: "+getDerrotas()+" vezes");
        System.out.println("Empatou: "+getEmpates()+" vezes"); 
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }
    //metodos Especiais
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        if (this.getPeso()< 52.2) {
            this.setCategoria("Inválida");
         } else if (this.getPeso() <= 70.3){
             this.setCategoria("Leve");
         } else if (this.getPeso()<= 83.9){
             this.setCategoria("Médio");
         } else if (this.getPeso()<= 120.2) {
             this.setCategoria("Pesado");
         } else {
             this.setCategoria("Inválido");
         }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}