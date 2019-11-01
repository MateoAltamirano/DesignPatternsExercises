package cine;

public class MainCine {

	public static void main(String[] args) {
		FactoryPelicula.make(ConcretePeliculas.Accion).operation();
		FactoryPelicula.make(ConcretePeliculas.Comedia).operation();
		FactoryPelicula.make(ConcretePeliculas.Terror).operation();
		FactoryPelicula.make(ConcretePeliculas.Drama).operation();

		ConcreteBoleto b1 = new ConcreteBoleto();
		b1.setCine("Megacenter");
		b1.setFuncion("Matine");
		b1.setHora(5);
		b1.setNombrePelicula("Joker");
		b1.setNumeroAsiento(1);
		b1.setRecomendaciones("buena pelicula");

		ConcreteBoleto b2 = (ConcreteBoleto) b1.clone();
		ConcreteBoleto b3 = (ConcreteBoleto) b1.clone();
		ConcreteBoleto b4 = (ConcreteBoleto) b1.clone();

		b2.setNumeroAsiento(2);
		b3.setNumeroAsiento(3);
		b4.setNumeroAsiento(4);

		System.out.println(
				"Boleto 1 para la pelicula " + b1.getNombrePelicula() + " en el asiento " + b1.getNumeroAsiento());
		System.out.println(
				"Boleto 2 para la pelicula " + b2.getNombrePelicula() + " en el asiento " + b2.getNumeroAsiento());
		System.out.println(
				"Boleto 3 para la pelicula " + b3.getNombrePelicula() + " en el asiento " + b3.getNumeroAsiento());
		System.out.println(
				"Boleto 4 para la pelicula " + b4.getNombrePelicula() + " en el asiento " + b4.getNumeroAsiento());

		Director director = new Director();
		ComboBuilder comboGigante = new ComboGiganteBuilder();
		director.setComboBuilder(comboGigante);
		director.buildProduct();
		Combos combo1 = director.getProduct();
		System.out.println("Combo gigante con: " + "gaseosas: " + combo1.getGaseosas() + ", pipoca: "
				+ combo1.getPipoca() + ", " + combo1.getChocolates() + " chocolates" + ", Bs: " + combo1.getPrecio());

		ComboBuilder comboMediano = new ComboMedianoBuilder();
		director.setComboBuilder(comboMediano);
		director.buildProduct();
		Combos combo2 = director.getProduct();
		System.out.println("Combo mediano con: " + "gaseosas: " + combo2.getGaseosas() + ", pipoca: "
				+ combo2.getPipoca() + ", " + combo2.getChocolates() + " chocolates" + ", Bs: " + combo2.getPrecio());

		ComboBuilder comboPequeño = new ComboPequeñoBuilder();
		director.setComboBuilder(comboPequeño);
		director.buildProduct();
		Combos combo3 = director.getProduct();
		System.out.println("Combo pequeño con: " + "gaseosas: " + combo3.getGaseosas() + ", pipoca: "
				+ combo3.getPipoca() + ", " + combo3.getChocolates() + " chocolates" + ", Bs: " + combo3.getPrecio());
	}

}
