package com.AnuncioCadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AnuncioCadastro.model.Anuncio;

/**
 * Repositório do cadastro de anúncios
 * @author anari
 *
 */
@Repository
public interface CadAnuncioRepository extends JpaRepository<Anuncio, Long>{

}
