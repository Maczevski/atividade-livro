
package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Livro;
import app.service.LivroService;

@RestController
@RequestMapping("/api/livro")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Livro livro){
		
		try {
			String mensagem = this.livroService.save(livro);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
						
		} catch (Exception e) {
			
			return new ResponseEntity<>("Erro: "+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@RequestBody Livro livro, @PathVariable long id){
		
		try {
			String mensagem = this.livroService.update(livro, id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro: "+e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Livro> findById(@PathVariable long id){
		
		try {
			Livro livro = this.livroService.findById(id);
			return new ResponseEntity<>(livro, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Livro>> findAll(){
		try {
			List<Livro> livros = this.livroService.findAll();
			return new ResponseEntity<>(livros, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable long id){
		
		try {
			String mensagem = this.livroService.delete(id);
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro: "+ e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
	}

}
