package Giuseppe.BackEndEs20.es03;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Ufficiali {
	private Ufficiali UfficialeSuperiore;
	private final int salario;

	public Ufficiali(int salario) {
		this.salario = salario;
	}

	public abstract void checkRequest(int importo);

	public void gestisciRichiesta(int importo) {
		if (importo <= salario) {
			System.out.println(getClass().getSimpleName() + " può approvare la richiesta.");
		} else if (UfficialeSuperiore != null) {
			UfficialeSuperiore.gestisciRichiesta(importo);
		} else {
			System.out.println("Nessun ufficiale superiore può approvare la richiesta.");
		}
	}
}
