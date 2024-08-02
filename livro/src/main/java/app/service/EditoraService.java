package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Editora;
import app.entity.Livro;

@Service
public class EditoraService {
	
	List<Editora> lista = new ArrayList<>();
	
	public EditoraService() {
        inicializarLista();
    }
	
	private void inicializarLista() {
		lista.add(new Editora(1, "Seguinte", "Rua Bandeira Paulista, 702 - SP"));		
		lista.add(new Editora(2, "Martin Claret", "Rua Alegrete, 62 - SP"));		
		lista.add(new Editora(3, "Record", "Rua Argentina, 171 - RJ"));		
		lista.add(new Editora(4, "Aleph", "Rua Bento Freitas, 306 - SP"));		
	
	}

	public String save(Editora editora) {
		lista.add(editora);
		return "Editora cadastrada!";
		
	}
	
	public String update(Editora editora, long id) {
		
		for(Editora e : lista) {
			if(e.getId() == id) {
				e.setNome(editora.getNome());
				e.setEndereco(editora.getEndereco());
				return "Editora "+ editora.getNome() +" atualizada!";
			}
		}
		return null;
		
	}
	
	public List<Editora> findAll() {
		
		return lista;
		
	}
	
	public Editora findById(long id) {
		for(Editora e : lista) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
		
	}
	
	public String delete(long id) {
		
		for(Editora e : lista) {
			if(e.getId() == id) {
				lista.remove(e);
				return e.getNome()+" excluído com sucesso!";
			}
		}
		return "Editora não encontrada :(";
		
	}

}
