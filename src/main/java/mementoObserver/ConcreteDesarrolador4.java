package mementoObserver;

public class ConcreteDesarrolador4 implements IObserver {

	@Override
	public void update(Cambio cambio) {

			System.out.println("Observador 4");
			System.out.println("[Notificacion] " + cambio.getCambio());
	
	}

}
