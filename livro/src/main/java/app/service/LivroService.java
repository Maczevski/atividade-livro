package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Livro;

@Service
public class LivroService {
	
	List<Livro> lista = new ArrayList<>();

	public LivroService() {
        inicializarLista();
    }

    private void inicializarLista() {
        lista.add(new Livro(1, "Biblioteca da Meia-Noite", "Matt Haig", 2020));
        lista.add(new Livro(2, "Por Lugares Incríveis", "Jennifer Niven", 2015));
        lista.add(new Livro(3, "Jane Eyre", "Charlotte Brontë", 1847));
        lista.add(new Livro(4, "Flores para Algernon", "Daniel Keyes", 1959));
        lista.add(new Livro(5, "A Vida Invisível de Addie LaRue", "Victoria Schwab", 2020));
    }
	
	public String save(Livro livro) {
		lista.add(livro);
		return "Livro cadastrado!";
	}

	public String update(Livro livro, long id) {
		
		for(Livro l : lista) {
			
			if(l.getId() == id) {
				l.setTitulo(livro.getTitulo());
				l.setAutor(livro.getAutor());
				l.setAno_publicacao(livro.getAno_publicacao());
				return l.getTitulo() + " atualizado com sucesso";
			}
			
		}
		return "Livro não encontrado";
	}

	public List<Livro> findAll() {
		
		return lista;
	}

	public Livro findById(long id) {

		List<Livro> listTemp = findAll();

		for (Livro livro : listTemp) {
			if (livro.getId() == id) {
				return livro;
			}
		}

		return null;
	}

	public String delete(long id) {
		List<Livro> listTemp = findAll();

		for (Livro livro : listTemp) {
			if (livro.getId() == id) {
				listTemp.remove(livro);
				return livro.getTitulo() + " foi excluído";
			}
		}
		return "Livro não encontrado";
	}

}
