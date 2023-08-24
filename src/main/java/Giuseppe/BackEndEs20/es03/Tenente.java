package Giuseppe.BackEndEs20.es03;

public class Tenente extends Ufficiali {
	public Tenente() {
		super(3000);

	}

	@Override
	public void checkRequest(int amount) {
		if (amount <= getSalario()) {
			System.out.println("Tenente non può effettuare questa richiesta");
		}

	}
}
