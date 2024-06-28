package com.example.exercicio01;

public class Livro implements Publicacao {
    private String titulo; 
    private String autor; 
    private int totPaginas; 
    private int pagAtual; 
    private boolean aberto; 
    private Pessoa leitor; 

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.leitor = leitor;
        this.pagAtual = 0;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    // Métodos da Classe
    public void detalhes() {
        System.out.println( 
            "O Livro é: " + getTitulo() + "\n Autor: " + getAutor() + "\n Tem " + getTotPaginas() + " Páginas \n O nome do leitor é: " + getLeitor().getNome()
        );
    }

    // Implementação da Interface Publicacao
    @Override
    public void titulo() {
        System.out.println("Nome de Livro: " + getTitulo());
    }

    @Override
    public void fechar() {
        setAberto(false);
        System.out.println("Livro Fechado");
    }

    @Override
    public void avancarPag() {
        if (isAberto()) {
            setPagAtual(getPagAtual() + 1);
            System.out.println("Pág atual é " + getPagAtual());
        } else {
            System.out.println("Abra o livro primeiro");
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()) {
            setPagAtual(getPagAtual() - 1);
            System.out.println("Pág atual é " + getPagAtual());
        } else {
            System.out.println("Abra o livro primeiro");
        }
    }

    @Override
    public void abrir() {
        setAberto(true);
        System.out.println("Livro Aberto");
    }

    @Override
    public void folhear(int n) {
        if (n > this.totPaginas) {
            this.pagAtual = 0; 
        } else {
            this.pagAtual = n;
        }
        System.out.println("Pág atual é " + getPagAtual());
    }
}
