package Giuseppe.BackEndEs20.es03;

public class Maggiore extends Ufficiali {
	public Maggiore() {
		super(2000);

	}

	@Override
	public void checkRequest(int amount) {
		if (amount <= getSalario()) {
			System.out.println("Maggiore non può effettuare questa richiesta");
		}

	}
}
