package memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	CareTaker careTaker = new CareTaker();
	Originator originator  = new Originator();
	Cambio commit;
	List<String> commitList = new ArrayList<String>();
	Random rand = new Random();
	int n = rand.nextInt(100);
		
	commit = new Cambio("Proyecto","1","Mateo",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","2","Adriana",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","3","Carlos",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","4","Emmi",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","5","Adriana",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	System.out.println(n);
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","6","Carlos",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","7","Emmi",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","8","Adriana",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","9","Carlos",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);	
	
	n = rand.nextInt(100);
	commit = new Cambio("Proyecto","10","Emmi",new Date());
	originator.commit(commit);
	careTaker.addMemento("commit"+n, originator.createMemento());
	commitList.add("commit"+n);
	
	originator.restoreCommit(careTaker.getMemento(commitList.get(4)));
	}

}
