package mementoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Repositorio repositorio = new Repositorio();
		Cambio commit;
		List<String> commitList = new ArrayList<String>();
		Random rand = new Random();

		ConcreteDesarrolador1 d1 = new ConcreteDesarrolador1();
		ConcreteDesarrolador2 d2 = new ConcreteDesarrolador2();
		ConcreteDesarrolador3 d3 = new ConcreteDesarrolador3();

		repositorio.suscribir(d1);
		repositorio.suscribir(d2);
		repositorio.suscribir(d3);

		int n = rand.nextInt(100);

		commit = new Cambio("Proyecto", "1", "Mateo", new Date());
		repositorio.commit(commit);
		careTaker.addMemento("commit" + n, repositorio.createMemento());
		commitList.add("commit" + n);

		n = rand.nextInt(100);
		commit = new Cambio("Proyecto", "2", "Adriana", new Date());
		repositorio.commit(commit);
		careTaker.addMemento("commit" + n, repositorio.createMemento());
		commitList.add("commit" + n);

		n = rand.nextInt(100);
		commit = new Cambio("Proyecto", "3", "Carlos", new Date());
		repositorio.commit(commit);
		careTaker.addMemento("commit" + n, repositorio.createMemento());
		commitList.add("commit" + n);

		n = rand.nextInt(100);
		commit = new Cambio("Proyecto", "4", "Emmi", new Date());
		repositorio.commit(commit);
		careTaker.addMemento("commit" + n, repositorio.createMemento());
		commitList.add("commit" + n);

		n = rand.nextInt(100);
		commit = new Cambio("Proyecto", "5", "Adriana", new Date());
		repositorio.commit(commit);
		careTaker.addMemento("commit" + n, repositorio.createMemento());
		commitList.add("commit" + n);
		System.out.println(n);

		repositorio.desuscribir(d1);
		repositorio.desuscribir(d2);
		repositorio.desuscribir(d3);

		ConcreteDesarrolador4 d4 = new ConcreteDesarrolador4();
		ConcreteDesarrolador5 d5 = new ConcreteDesarrolador5();
		ConcreteDesarrolador6 d6 = new ConcreteDesarrolador6();

		repositorio.suscribir(d4);
		repositorio.suscribir(d5);
		repositorio.suscribir(d6);

		repositorio.restoreCommit(careTaker.getMemento(commitList.get(4)));
	}

}
