package app;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.service.LivroService;
import entity.Livro;

import app.service.EditoraService;
import entity.Editora;

import app.service.BibliotecaService;
import entity.Biblioteca;

@SpringBootApplication
public class ProjetoApplication {

private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
	SpringApplication.run(ProjetoApplication.class, args);
	LivroService livroService = new LivroService();
	EditoraService editoraService = new EditoraService();
	BibliotecaService bibliotecaService = new BibliotecaService();
	
		int escolha;
		
		do{
		printMenu();
		escolha = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch(escolha) {
        case 1:
        System.out.println("Listagem de Livros Cadastrados:");
            List<Livro> listaLivros = livroService.findAll();
        	break;
        case 2:
        System.out.println("Listagem de Biblioteca Cadastradas:");
            List<Biblioteca> listaBiblioteca = bibliotecaService.findAll();
        	break;
        case 3:
        System.out.println("Listagem de Editora Cadastradas:");
            List<Editora> listaEditora = editoraService.findAll();
        	break;
        case 0:
        System.out.println("Escolhido SAIR!" +"\n-Programa Encerrado!");
        System.exit(0);
        	break;
        default:
        System.out.println("Escolha errada! Tente novamente.");
        }
	} while (escolha != 1 && escolha != 2 && escolha != 3);
}

	private static void printMenu() {
        System.out.println("1- Listar Livros?");
        System.out.println("2- Listar Biblioteca?");
        System.out.println("3- Listar Controller?");
        System.out.println("0 - Sair");
    }
    
}