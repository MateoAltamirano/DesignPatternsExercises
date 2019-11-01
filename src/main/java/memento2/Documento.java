package memento2;

public class Documento {
	private String name;
	private String version;

	public Documento(String name, String state) {
		this.name = name;
		this.version = state;
	}

	public void show() {
		System.out.println("Current values --> Name: " + name + " Version: " + version);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}