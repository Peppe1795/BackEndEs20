package Giuseppe.BackEndEs20;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Giuseppe.BackEndEs20.es01.Info;
import Giuseppe.BackEndEs20.es01.InfoAdapter;
import Giuseppe.BackEndEs20.es01.UserData;
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

		// ------- ESERCIZIO 1 ---------

		Info info = new Info();
		info.setNome("Mario");
		info.setCognome("Rossi");
		info.setDataDiNascita(new Date(90, 5, 15));

		InfoAdapter adapter = new InfoAdapter(info);

		UserData userData = new UserData();
		userData.getData(adapter);

		System.out.println();
		System.out.println("------- ESERCIZIO 1 ---------");
		System.out.println("Nome completo: " + userData.getFullName());
		System.out.println("Età: " + userData.getAge());
		System.out.println();

		// ------- ESERCIZIO 2 ---------

		Pagina pagina1 = new Pagina(10);
		Pagina pagina2 = new Pagina(8);
		Sezione sezione1 = new Sezione();
		sezione1.aggiungiElemento(new Pagina(5));
		sezione1.aggiungiElemento(new Pagina(6));

		Sezione sezione2 = new Sezione();
		sezione2.aggiungiElemento(new Pagina(4));
		sezione2.aggiungiElemento(new Pagina(3));

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

		// ESERCIZIO 3

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
