package prototype;

public class ConcreteDocente implements IDocente {
	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public boolean isCursoEduSup() {
		return cursoEduSup;
	}

	public void setCursoEduSup(boolean cursoEduSup) {
		this.cursoEduSup = cursoEduSup;
	}

	public boolean isAcceso() {
		return acceso;
	}

	public void setAcceso(boolean acceso) {
		this.acceso = acceso;
	}

	public boolean isMarcadoBiometrico() {
		return marcadoBiometrico;
	}

	public void setMarcadoBiometrico(boolean marcadoBiometrico) {
		this.marcadoBiometrico = marcadoBiometrico;
	}

	public int getMarcadoHoraEntrada() {
		return marcadoHoraEntrada;
	}

	public void setMarcadoHoraEntrada(int marcadoHoraEntrada) {
		this.marcadoHoraEntrada = marcadoHoraEntrada;
	}

	public int getMarcadoHoraSalida() {
		return marcadoHoraSalida;
	}

	public void setMarcadoHoraSalida(int marcadoHoraSalida) {
		this.marcadoHoraSalida = marcadoHoraSalida;
	}

	private int sueldo;
	private int cargaHoraria;
	private boolean cursoEduSup;
	private boolean acceso;
	private boolean marcadoBiometrico;
	private int marcadoHoraEntrada;
	private int marcadoHoraSalida;
	private String name;
	private String apellido;
	
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConcreteDocente() {
		
	}

	@Override
	public Object clone() {
		ConcreteDocente cloneObj = new ConcreteDocente();
		cloneObj.setName(name);
		cloneObj.setApellido(apellido);
		cloneObj.setAcceso(acceso);
		cloneObj.setCargaHoraria(cargaHoraria);
		cloneObj.setCursoEduSup(cursoEduSup);
		cloneObj.setMarcadoBiometrico(marcadoBiometrico);
		cloneObj.setMarcadoHoraEntrada(marcadoHoraEntrada);
		cloneObj.setMarcadoHoraSalida(marcadoHoraSalida);
		cloneObj.setSueldo(sueldo);
		return cloneObj;
	}

}
