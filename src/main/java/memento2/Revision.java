package memento2;

public class Revision {
	private Documento version;

	public Revision(Documento versionTosave) {
		this.version = versionTosave;
	}

	public Documento getSavedVersion() {
		return version;
	}
}
