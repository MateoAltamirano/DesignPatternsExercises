package mementoObserver;

public class ConcreteDesarrolador3 implements IObserver {

	@Override
	public void update(Cambio cambio) {

			System.out.println("Observador 3");
			System.out.println("[Notificacion] " + cambio.getCambio());
	
	}

}
