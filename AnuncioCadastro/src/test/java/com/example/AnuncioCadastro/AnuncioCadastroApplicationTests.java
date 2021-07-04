package com.example.AnuncioCadastro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.AnuncioCadastro.model.Anuncio;
import com.AnuncioCadastro.model.Relatorio;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
@SpringBootTest
class AnuncioCadastroApplicationTests {
	
	Relatorio relatorio = new Relatorio();

	@Test
	void contextLoads() {
		LocalDate dat1 = LocalDate.of(2020, Month.SEPTEMBER, 23);
	    LocalDate dat2 = LocalDate.of(2020, Month.OCTOBER, 7);
		
		Anuncio anuncio1 = new Anuncio(4L, "Leve 3 pague 2", "Colgate", dat1, dat2, 100.0);
		
		assertEquals("Valor total investido no anuncio: 1400.0. A quantidade máxima de visualizações do anuncio: 109689. A quantidade máxima de cliques do anúncio: 11282. A quantidade máxima de compartilhamentos do anúncio: 1692.", relatorio.getRelatorio(anuncio1));
		
		dat1 = LocalDate.of(2020, Month.JANUARY, 6);
	    dat2 = LocalDate.of(2020, Month.FEBRUARY, 7);
		
		Anuncio anuncio2 = new Anuncio(4L, "Tudo até 50% off", "Renner", dat1, dat2, 25.0);
		
		assertEquals("Valor total investido no anuncio: 800.0. A quantidade máxima de visualizações do anuncio: 62680. A quantidade máxima de cliques do anúncio: 6447. A quantidade máxima de compartilhamentos do anúncio: 967.", relatorio.getRelatorio(anuncio2));
		
		dat1 = LocalDate.of(2020, Month.AUGUST, 27);
	    dat2 = LocalDate.of(2020, Month.SEPTEMBER, 30);
		
		Anuncio anuncio3 = new Anuncio(4L, "Setembro Amarelo", "Secretaria de saúde da Paraíba", dat1, dat2, 40.0);
		
		assertEquals("Valor total investido no anuncio: 1360.0. A quantidade máxima de visualizações do anuncio: 106555. A quantidade máxima de cliques do anúncio: 10959. A quantidade máxima de compartilhamentos do anúncio: 1644.", relatorio.getRelatorio(anuncio3));

		dat1 = LocalDate.of(2020, Month.MAY, 1);
	    dat2 = LocalDate.of(2020, Month.MAY, 10);
		
		Anuncio anuncio4 = new Anuncio(4L, "Especial dia das mães", "Boticário", dat1, dat2, 500.5);
		
		assertEquals("Valor total investido no anuncio: 4504.5. A quantidade máxima de visualizações do anuncio: 352925. A quantidade máxima de cliques do anúncio: 36298. A quantidade máxima de compartilhamentos do anúncio: 5445.", relatorio.getRelatorio(anuncio4));

		dat1 = LocalDate.of(2020, Month.JUNE, 4);
	    dat2 = LocalDate.of(2020, Month.JUNE, 15);
		
		Anuncio anuncio5 = new Anuncio(4L, "Especial dia dos namorados", "Cacau Show", dat1, dat2, 469.9);
		
		assertEquals("Valor total investido no anuncio: 5168.9. A quantidade máxima de visualizações do anuncio: 404980. A quantidade máxima de cliques do anúncio: 41652. A quantidade máxima de compartilhamentos do anúncio: 6248.", relatorio.getRelatorio(anuncio5));
	
	}

}
