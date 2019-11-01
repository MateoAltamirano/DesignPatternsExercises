package observer;

import java.util.ArrayList;

public class CanalYouTube implements ISubject {
	private ArrayList<IObserver> observadores = new ArrayList<>();
	private Video video;

	public void setVideo(Video video) {
		this.video = video;
		this.notifyObserver();
	}

	@Override
	public void suscribir(IObserver observer) {
		observadores.add(observer);
	}

	@Override
	public void detach(IObserver observer) {
		observadores.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observadores.size(); i++) {
			observadores.get(i).update(video);
		}
	}

}
