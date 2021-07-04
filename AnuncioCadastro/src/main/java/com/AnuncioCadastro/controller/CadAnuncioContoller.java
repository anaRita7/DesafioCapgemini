package com.AnuncioCadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AnuncioCadastro.model.Anuncio;
import com.AnuncioCadastro.service.CadAnuncioService;

/**
 * Calsse de controle de cadastro de anúncios
 * @author anari
 *
 */
@RestController
public class CadAnuncioContoller {

	@Autowired
	private CadAnuncioService anuncioService;
	
	@GetMapping(value = "anuncios", produces = "application/json")
	public List<Anuncio> getAll() {
		return anuncioService.getAll();
	}
	
	@PostMapping(value = "anuncios", produces = "application/json")
	public Anuncio create(@RequestBody Anuncio Anuncio) {
		return anuncioService.create(Anuncio);
	}
	
	@DeleteMapping(value = "anuncios/{id}", produces = "application/json")
	public void create(@PathVariable Long id) {
		anuncioService.delete(id);;
	}
	
	@PutMapping(value = "anuncios", produces = "application/json")
	public Anuncio update(@RequestBody Anuncio Anuncio) {
		return anuncioService.create(Anuncio);
	}
}
