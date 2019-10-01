package prototype;

public class MainDocentes {

	public static void main(String[] args) {

		ConcreteDocente d1 = new ConcreteDocente();
		d1.setName("Mateo");
		d1.setAcceso(true);
		d1.setCargaHoraria(80);
		d1.setCursoEduSup(true);
		d1.setMarcadoBiometrico(false);
		d1.setMarcadoHoraEntrada(8);
		d1.setMarcadoHoraSalida(18);
		d1.setSueldo(5000);
		System.out.println(d1.getName());

		ConcreteDocente d2 = (ConcreteDocente) d1.clone();
		ConcreteDocente d3 = (ConcreteDocente) d1.clone();
		ConcreteDocente d4 = (ConcreteDocente) d1.clone();
		ConcreteDocente d5 = (ConcreteDocente) d1.clone();
		ConcreteDocente d6 = (ConcreteDocente) d1.clone();
		ConcreteDocente d7 = (ConcreteDocente) d1.clone();
		ConcreteDocente d8 = (ConcreteDocente) d1.clone();
		ConcreteDocente d9 = (ConcreteDocente) d1.clone();
		ConcreteDocente d10 = (ConcreteDocente) d1.clone();
		ConcreteDocente d11 = (ConcreteDocente) d1.clone();
		ConcreteDocente d12 = (ConcreteDocente) d1.clone();
		ConcreteDocente d13 = (ConcreteDocente) d1.clone();
		ConcreteDocente d14 = (ConcreteDocente) d1.clone();
		ConcreteDocente d15 = (ConcreteDocente) d1.clone();
		
		d2.setName("2");
		System.out.println(d2.getName());
		d2.setName("3");
		System.out.println(d2.getName());
		d2.setName("4");
		System.out.println(d2.getName());
		d2.setName("5");
		System.out.println(d2.getName());
		d2.setName("6");
		System.out.println(d2.getName());
		d2.setName("7");
		System.out.println(d2.getName());
		d2.setName("8");
		System.out.println(d2.getName());
		d2.setName("9");
		System.out.println(d2.getName());
		d2.setName("10");
		System.out.println(d2.getName());
		d2.setName("11");
		System.out.println(d2.getName());
		d2.setName("12");
		System.out.println(d2.getName());
		d2.setName("13");
		System.out.println(d2.getName());
		d2.setName("14");
		System.out.println(d2.getName());
		d2.setName("15");
		System.out.println(d2.getName());
	}
}
