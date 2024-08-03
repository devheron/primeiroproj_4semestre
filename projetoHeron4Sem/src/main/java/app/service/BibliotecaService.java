package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Biblioteca;

@Service
public class BibliotecaService {

	public String save (Biblioteca biblioteca) {
		return "Biblioteca cadastrada com sucesso!";
	}
	
	public String update (Biblioteca biblioteca, long id) {
		return "Biblioteca atualizada com sucesso!";
	}
	
	public Biblioteca findById (long id) {
		List<Biblioteca> listaBiblioteca = this.findAll();
		
		for (int i = 0; i < listaBiblioteca.size(); i++) {
			if(listaBiblioteca.get(i).getId() == id) {
				return listaBiblioteca.get(i);
			}
		}
		
		return null;
	}
	
	public List<Biblioteca> findAll() {
		
        // Cria uma lista de livros
        List<Biblioteca> listaBiblioteca = new ArrayList<>();

        // Adiciona livros diretamente à lista
        listaBiblioteca.add(new Biblioteca(1, "Biblioteca de Foz", "Rua: Jardim Grande, Bairro Azul", "4599154687"));
        listaBiblioteca.add(new Biblioteca(2, "Biblioteca São Marino", "Rua Pequena, Bairro Verde", "4599187187"));

        // Exibe a lista de livros
        for (Biblioteca biblioteca : listaBiblioteca) {
            System.out.println(biblioteca);
        }
		
		return listaBiblioteca;
	}

	public String delete (long id) {
		
		List<Biblioteca> listaBiblioteca = this.findAll();
		
		for (int i = 0; i < listaBiblioteca.size(); i++) {
			if(listaBiblioteca.get(i).getId() == id) {
				return listaBiblioteca.get(i).getNome()+" deletado com sucesso!";
			}
		}
		return "Biblioteca não encontrada!";
	}
}