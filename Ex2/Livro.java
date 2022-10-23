package TP2.Ex2;

import java.util.*;

public class Livro {

    private String titulo; // variavel
    private String autor;
    private String editora;
    private short anoedicao;

    public Livro(String Titulo, String Autor, String Editora, short AnoEdicao) {
        this.titulo = Titulo;
        this.autor = Autor;
        this.editora = Editora;
        this.anoedicao = AnoEdicao;
    }

    public void setTitulo(String Titulo) { // terror
        this.titulo = Titulo; // terorr
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public void setEditora(String Editora) {
        this.editora = Editora;
    }

    public void setAnoEdicao(short AnoEdicao) {
        this.anoedicao = AnoEdicao;
    }

    // metodo public - tipo do metodo - nome do metodo - parametros do metodo
    public String getTitulo() {
        return this.titulo; // ROMANCE
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public short getAnoEdicao() {
        return this.anoedicao;
    }

    public String getDados() {

        return "Titulo = " + this.titulo + " Autor = " + this.autor + " Editora = " + this.editora + " Ano = "
                + this.anoedicao;

    }

}