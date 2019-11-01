package mementoObserver;

public class ConcreteDesarrolador1 implements IObserver {

	@Override
	public void update(Cambio cambio) {

			System.out.println("Observador 1");
			System.out.println("[Notificacion] " + cambio.getCambio());
	
	}

}
