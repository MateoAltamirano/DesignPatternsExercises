package mementoObserver;

public class ConcreteDesarrolador5 implements IObserver {

	@Override
	public void update(Cambio cambio) {

			System.out.println("Observador 5");
			System.out.println("[Notificacion] " + cambio.getCambio());
	
	}

}
