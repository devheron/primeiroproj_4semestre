package entity;

public class Livro {

	private long id;
	private String titulo;
	private int ano_lancamento;
	private String autor;
	
    public Livro() {
    }

    public Livro(long id, String titulo, int ano_lancamento, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.ano_lancamento = ano_lancamento;
        this.autor = autor;
    }
	
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String toString() {
        return "Livro: {" +
                "ID = " + id +
                ", Titulo = '" + titulo + '\'' +
                ", Ano de Lançamento = " + ano_lancamento +
                ", Autor do Livro = '" + autor + '\'' +
                '}';
    }
}