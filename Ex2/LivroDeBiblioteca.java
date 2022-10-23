package TP2.Ex2;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    public boolean emprestado;
    public String localizacao;

    public LivroDeBiblioteca(String Titulo, String Autor, String Editora, short AnoEdicao, String Localizacao) {
        super(Titulo, Autor, Editora, AnoEdicao);
        this.localizacao = Localizacao;
        this.emprestado = false;
    }

    @Override
    public boolean getEmprestado() {
        return emprestado;
    };

    @Override
    public String getLocalizacao() {
        return localizacao;
    };

    @Override
    public void Empresta() {
        this.emprestado = true;
    };

    @Override
    public void Devolve() {
        this.emprestado = false;
    };

    @Override
    public String getDados() {

        return "Titulo = " + this.getTitulo() + " Autor = " + this.getAutor() + " Editora = " + this.getEditora()
                + " Ano = " + this.getAnoEdicao() + " Localizacao = " + this.localizacao;

    }

}