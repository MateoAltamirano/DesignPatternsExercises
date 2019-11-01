package strategy2;

public class Main {

	public static void main(String[] args) {
		TiendaDeCelulares context = new TiendaDeCelulares();

		Celular[] celulares1 = new Celular[3];
		celulares1[0] = new Celular(Modelos.Modelo1, Marcas.Apple, Gamas.Alta, 1000);
		celulares1[1] = new Celular(Modelos.Modelo2, Marcas.Samgsung, Gamas.Media, 900);
		celulares1[2] = new Celular(Modelos.Modelo3, Marcas.Huawei, Gamas.Baja, 800);

		Celular[] celulares2 = new Celular[5];
		celulares2[0] = new Celular(Modelos.Modelo1, Marcas.Apple, Gamas.Alta, 1000);
		celulares2[1] = new Celular(Modelos.Modelo2, Marcas.Samgsung, Gamas.Media, 900);
		celulares2[2] = new Celular(Modelos.Modelo3, Marcas.Huawei, Gamas.Baja, 800);
		celulares2[3] = new Celular(Modelos.Modelo1, Marcas.Samgsung, Gamas.Alta, 1000);
		celulares2[4] = new Celular(Modelos.Modelo2, Marcas.Apple, Gamas.Media, 800);

		context.setCelulares(celulares1,new Celular(Modelos.Modelo2, Marcas.Samgsung, Gamas.Media, 900));
		context.execute();
		context.setCelulares(celulares2, new Celular(Modelos.Modelo2, Marcas.Apple, Gamas.Media, 800));
		context.execute();

	}

}
