package Giuseppe.BackEndEs20.es03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Filter {
	private Filter next;

	// METODO DI CONTROLLO DEI FILTRI
	public abstract void check(Ufficiali u);

	// MANDA AL PROSSIMO BLOCCO
	public void goNext(Ufficiali u) {
		if (this.getNext() != null) {
			this.next.check(u);
		} else {
			System.out.println("FINE BLOCCHI");
		}
	}
}
