package observer;

public class Main {

	public static void main(String[] args) {
		CanalYouTube canal = new CanalYouTube();
		
		ConcreteObaservador1 o1 = new ConcreteObaservador1();
		ConcreteObaservador2 o2 = new ConcreteObaservador2();
		ConcreteObaservador3 o3 = new ConcreteObaservador3();
		ConcreteObaservador4 o4 = new ConcreteObaservador4();
		ConcreteObaservador5 o5 = new ConcreteObaservador5();
		
		o1.setCategoriaPreferida(Categorias.Deportes);
		o2.setCategoriaPreferida(Categorias.Deportes);
		o3.setCategoriaPreferida(Categorias.Tecnologia);
		o4.setCategoriaPreferida(Categorias.Noticias);
		o5.setCategoriaPreferida(Categorias.anyCategory);
		
		
		canal.suscribir(o1);
		canal.suscribir(o2);
		canal.suscribir(o3);
		canal.suscribir(o4);
		canal.suscribir(o5);

		
		canal.setVideo(new Video("Video de deportes", 10, Categorias.Deportes));

		canal.setVideo(new Video("Video de ciencia", 20, Categorias.Ciencia));

		canal.setVideo(new Video("Video de tecnologia", 15, Categorias.Tecnologia));

		canal.setVideo(new Video("Video de noticias", 4, Categorias.Noticias));

		canal.setVideo(new Video("Video de algo", 9, Categorias.anyCategory));

	}

}
