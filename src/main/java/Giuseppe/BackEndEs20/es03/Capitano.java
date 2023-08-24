package Giuseppe.BackEndEs20.es03;

public class Capitano extends Ufficiali {
	public Capitano() {
		super(1000);

	}

	@Override
	public void checkRequest(int amount) {
		if (amount <= getSalario()) {
			System.out.println("Capitano non può effettuare questa richiesta");
		}

	}
}
