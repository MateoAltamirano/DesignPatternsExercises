package mediator;

public class ConcreteSala implements SalaChat {
	Desarrollador1 desarrollador1;
	Desarrollador2 desarrollador2;
	Desarrollador3 desarrollador3;
	Desarrollador4 desarrollador4;

	@Override
	public void send(String msg, Desarrolladores origen) {
		switch (origen) {
		case Desarrollador1:
			desarrollador2.messageReceived(msg);
			desarrollador3.messageReceived(msg);
			desarrollador4.messageReceived(msg);
			break;
		case Desarrollador2:
			desarrollador1.messageReceived(msg);
			desarrollador3.messageReceived(msg);
			desarrollador4.messageReceived(msg);
			break;
		case Desarrollador3:
			desarrollador1.messageReceived(msg);
			desarrollador2.messageReceived(msg);
			desarrollador4.messageReceived(msg);
			break;
		case Desarrollador4:
			desarrollador1.messageReceived(msg);
			desarrollador2.messageReceived(msg);
			desarrollador3.messageReceived(msg);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + origen);
		}
	}

	public void setDesarrollador1(Desarrollador1 desarrollador1) {
		this.desarrollador1 = desarrollador1;
	}

	public void setDesarrollador2(Desarrollador2 desarrollador2) {
		this.desarrollador2 = desarrollador2;
	}

	public void setDesarrollador3(Desarrollador3 desarrollador3) {
		this.desarrollador3 = desarrollador3;
	}

	public void setDesarrollador4(Desarrollador4 desarrollador4) {
		this.desarrollador4 = desarrollador4;
	}

	@Override
	public void sendSpecific(String msg, Desarrolladores origen, Desarrolladores destino) {
		switch (origen) {
		case Desarrollador1:
			switch (destino) {
			case Desarrollador2:
				desarrollador2.messageReceived(msg);
				break;
			case Desarrollador3:
				desarrollador3.messageReceived(msg);
				break;
			case Desarrollador4:
				desarrollador4.messageReceived(msg);
				break;
			default:
				break;

			}
			break;
		case Desarrollador2:
			switch (destino) {
			case Desarrollador1:
				desarrollador1.messageReceived(msg);
				break;
			case Desarrollador3:
				desarrollador3.messageReceived(msg);
				break;
			case Desarrollador4:
				desarrollador4.messageReceived(msg);
				break;
			default:
				break;

			}
			break;
		case Desarrollador3:
			switch (destino) {
			case Desarrollador1:
				desarrollador1.messageReceived(msg);
				break;
			case Desarrollador2:
				desarrollador2.messageReceived(msg);
				break;
			case Desarrollador4:
				desarrollador4.messageReceived(msg);
				break;
			default:
				break;

			}
			break;
		case Desarrollador4:
			switch (destino) {
			case Desarrollador1:
				desarrollador1.messageReceived(msg);
				break;
			case Desarrollador2:
				desarrollador2.messageReceived(msg);
				break;
			case Desarrollador3:
				desarrollador3.messageReceived(msg);
				break;
			default:
				break;

			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + origen);
		}
	}

}
