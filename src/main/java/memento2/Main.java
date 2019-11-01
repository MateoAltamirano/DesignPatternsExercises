package memento2;

public class Main {

	public static void main(String[] args) {
	CareTaker careTaker = new CareTaker();
	Originator originator  = new Originator();
	Documento tesis;
	
	tesis = new Documento("Tesis","Version 1");
	originator.setRevision(tesis);
	careTaker.addRevision(originator.createRevision());
	
	tesis = new Documento("Tesis","Version 2");
	originator.setRevision(tesis);
	careTaker.addRevision(originator.createRevision());
	
	tesis = new Documento("Tesis","Version 3");
	originator.setRevision(tesis);
	careTaker.addRevision(originator.createRevision());
	
	tesis = new Documento("Tesis","Version 4");
	originator.setRevision(tesis);
	careTaker.addRevision(originator.createRevision());
	
	tesis = new Documento("Tesis","Version 5");
	originator.setRevision(tesis);
	careTaker.addRevision(originator.createRevision());
	
	originator.restoreFromRevision(careTaker.getMemento(2));
	}

}
