package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Biblioteca;

@Service
public class BibliotecaService {
	
List<Biblioteca> lista = new ArrayList<>();
	
	public BibliotecaService() {
        inicializarLista();
    }
	
	private void inicializarLista() {
		lista.add(new Biblioteca(1, "Avenida Comendador Franco, 895 - PR", "45 3546-8327"));		
	
	}

	public String save(Biblioteca biblioteca) {
		lista.add(biblioteca);
		return "Biblioteca cadastrada!";
		
	}
	
	public String update(Biblioteca biblioteca, long id) {
		
		for(Biblioteca b : lista) {
			if(b.getId() == id) {
				b.setEndereco(biblioteca.getEndereco());
				b.setTelefone(b.getTelefone());
				return "Biblioteca atualizada!";
			}
		}
		return null;
		
	}
	
	public List<Biblioteca> findAll() {
		
		return lista;
		
	}
	
	public Biblioteca findById(long id) {
		for(Biblioteca b : lista) {
			if(b.getId() == id) {
				return b;
			}
		}
		return null;
		
	}
	
	public String delete(long id) {
		
		for(Biblioteca b : lista) {
			if(b.getId() == id) {
				lista.remove(b);
				return "Biblioteca excluída!";
			}
		}
		return "Biblioteca não encontrada";
		
	}
	
}
