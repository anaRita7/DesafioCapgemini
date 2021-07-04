package com.AnuncioCadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AnuncioCadastro.model.Anuncio;
import com.AnuncioCadastro.repository.CadAnuncioRepository;

/**
 * Classe de Serviço do Cadastro de anúncios
 * @author anari
 *
 */
@Component
public class CadAnuncioService {

	@Autowired
	private CadAnuncioRepository anuncioRepository;
	
	public Anuncio create(Anuncio Anuncio) {
		return anuncioRepository.save(Anuncio);
	}
	
	public Anuncio update(Anuncio Anuncio) {
		return anuncioRepository.save(Anuncio);
	}
	
	public void delete(Long id) {
		anuncioRepository.deleteById(id);
	}
	
	public List<Anuncio> getAll() {
		return anuncioRepository.findAll();
	}
}
