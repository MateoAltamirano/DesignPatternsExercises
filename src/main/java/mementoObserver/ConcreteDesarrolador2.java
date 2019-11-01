package mementoObserver;

public class ConcreteDesarrolador2 implements IObserver {

	@Override
	public void update(Cambio cambio) {

			System.out.println("Observador 2");
			System.out.println("[Notificacion] " + cambio.getCambio());
	
	}

}
