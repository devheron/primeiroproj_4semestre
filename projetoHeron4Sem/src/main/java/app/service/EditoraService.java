package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import entity.Editora;

@Service
public class EditoraService {

	public String save (Editora editora) {
		return "Editora cadastrada com sucesso!";
	}
	
	public String update (Editora editora, long id) {
		return "Editora atualizada com sucesso!";
	}
	
	public Editora findById (long id) {
		List<Editora> listaEditora = this.findAll();
		
		for (int i = 0; i < listaEditora.size(); i++) {
			if(listaEditora.get(i).getId() == id) {
				return listaEditora.get(i);
			}
		}
		
		return null;
	}
	
	public List<Editora> findAll() {
		
        // Cria uma lista de livros
        List<Editora> listaEditora = new ArrayList<>();

        // Adiciona livros diretamente à lista
        listaEditora.add(new Editora(1, "Editora de Foz do Iguaçu", "Rua Quati Bairro de Matinhos"));
        listaEditora.add(new Editora(2, "Editora de São Paulo", "Rua Céu Nublado Bairro Olimpico"));

        // Exibe a lista de livros
        for (Editora editora : listaEditora) {
            System.out.println(editora);
        }
		
		return listaEditora;
	}

	public String delete (long id) {
		
		List<Editora> listaEditora = this.findAll();
		
		for (int i = 0; i < listaEditora.size(); i++) {
			if(listaEditora.get(i).getId() == id) {
				return listaEditora.get(i).getNome()+" deletado com sucesso!";
			}
		}
		return "Editora não encontrada!";
	}
}