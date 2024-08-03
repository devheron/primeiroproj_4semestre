package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Livro;

@Service
public class LivroService {

	public String save (Livro livro) {
		return "Livro cadastrado com sucesso!";
	}
	
	public String update (Livro livro, long id) {
		return "Livro atualizado com sucesso!";
	}
	
	public Livro findById (long id) {
		List<Livro> listaLivro = this.findAll();
		
		for (int i = 0; i < listaLivro.size(); i++) {
			if(listaLivro.get(i).getId() == id) {
				return listaLivro.get(i);
			}
		}
		
		return null;
	}
	
	public List<Livro> findAll() {
		
        // Cria uma lista de livros
        List<Livro> listaLivros = new ArrayList<>();

        // Adiciona livros diretamente à lista
        listaLivros.add(new Livro(1, "1984", 1949, "George Orwell"));
        listaLivros.add(new Livro(2, "O Senhor dos Anéis", 1954, "J.R.R. Tolkien"));

        // Exibe a lista de livros
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
		
		return listaLivros;
	}

	public String delete (long id) {
		
		List<Livro> listaLivro = this.findAll();
		
		for (int i = 0; i < listaLivro.size(); i++) {
			if(listaLivro.get(i).getId() == id) {
				return listaLivro.get(i).getTitulo()+" deletado com sucesso!";
			}
		}
		return "Livro não encontrado!";
	}
}