package Giuseppe.BackEndEs20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Giuseppe.BackEndEs20.es02.Libro;
import Giuseppe.BackEndEs20.es02.Pagina;
import Giuseppe.BackEndEs20.es02.Sezione;
import Giuseppe.BackEndEs20.es03.Capitano;
import Giuseppe.BackEndEs20.es03.Colonnello;
import Giuseppe.BackEndEs20.es03.Generale;
import Giuseppe.BackEndEs20.es03.Maggiore;
import Giuseppe.BackEndEs20.es03.Ufficiali;

@SpringBootApplication
public class BackEndEs20Application {

	public static void main(String[] args) {
		SpringApplication.run(BackEndEs20Application.class, args);

		// ------- ESERCIZIO 2 ---------

		Pagina pagina1 = new Pagina(10);
		Pagina pagina2 = new Pagina(8);
		Pagina pagina11 = new Pagina(11);
		Pagina pagina12 = new Pagina(12);
		Sezione sezione1 = new Sezione();
		Sezione sottoSezione1 = new Sezione();
		sezione1.aggiungiElemento(new Pagina(5));
		sezione1.aggiungiElemento(new Pagina(6));

		Sezione sezione2 = new Sezione();
		sezione2.aggiungiElemento(new Pagina(4));
		sezione2.aggiungiElemento(new Pagina(3));
		sottoSezione1.aggiungiElemento(pagina11);
		sottoSezione1.aggiungiElemento(pagina12);
		sezione1.aggiungiElemento(sottoSezione1);

		Libro libro = new Libro();
		libro.aggiungiElemento(pagina1);
		libro.aggiungiElemento(pagina2);
		libro.aggiungiElemento(sezione1);
		libro.aggiungiElemento(sezione2);
		libro.aggiungiAutore("Autore 1");
		libro.aggiungiAutore("Autore 2");
		libro.setPrezzo(29.99);

		System.out.println("------- ESERCIZIO 2 ---------");
		libro.stampa();
		System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());

		System.out.println("-------- ESERCIZIO 3 -----------");

		Ufficiali generale = new Generale();
		Ufficiali colonnello = new Colonnello();
		Ufficiali maggiore = new Maggiore();
		Ufficiali capitano = new Capitano();

		capitano.setUfficialeSuperiore(maggiore);
		maggiore.setUfficialeSuperiore(colonnello);
		colonnello.setUfficialeSuperiore(generale);

		int importo = 5000;
		capitano.gestisciRichiesta(importo);
	}
}
