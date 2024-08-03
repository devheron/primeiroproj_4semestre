package entity;

public class Biblioteca {

	private long id;
	private String nome;
	private String endereco;
	private String telefone;
	
    public Biblioteca() {
    }

    public Biblioteca(long id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
	
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
        return "Biblioteca {" +
                "ID = " + id +
                ", Nome = '" + nome + '\'' +
                ", Endereco = " + endereco +
                ", Telefone = '" + telefone + '\'' +
                '}';
    }
}