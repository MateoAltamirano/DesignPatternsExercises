package mementoObserver;

public class ConcreteDesarrolador6 implements IObserver {

	@Override
	public void update(Cambio cambio) {

			System.out.println("Observador 6");
			System.out.println("[Notificacion] " + cambio.getCambio());
	
	}

}
