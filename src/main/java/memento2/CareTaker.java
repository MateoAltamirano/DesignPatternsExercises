package memento2;

import java.util.ArrayList;

public class CareTaker {
	
	private ArrayList<Revision> savedVersions = new ArrayList<Revision>();

	public void addRevision(Revision m) {
		savedVersions.add(m);
	}

	public Revision getMemento(int index) {
		return savedVersions.get(index);
	}
}
