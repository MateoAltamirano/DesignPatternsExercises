package memento2;

public class Originator {
	private Documento version;

	public void setRevision(Documento version) {
		System.out.println("Originator: Setting version to " + version.getVersion());
		version.show();
		this.version = version;
	}

	public Revision createRevision() {
		System.out.println("Originator: Create Memento.");
		version.show();
		return new Revision(version);
	}

	public void restoreFromRevision(Revision m) {
		version = m.getSavedVersion();
		System.out.println("Originator: Version after restoring from Memento: " + version.getVersion());
		version.show();
	}
}
