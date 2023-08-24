package Giuseppe.BackEndEs20.es03;

public class Colonnello extends Ufficiali {

	public Colonnello() {
		super(4000);

	}

	@Override
	public void checkRequest(int amount) {
		if (amount <= getSalario()) {
			System.out.println("Colonnello non può effettuare questa richiesta");
		}

	}
}
