package loja;

import java.util.ArrayList;
import java.util.List;

public class PedidoHandler {
	
	private List<Listener> listeners;
	
	public PedidoHandler() {
		this.listeners = new ArrayList<Listener>();
	}
	
	public void inscrever(Listener listener) {
		listeners.add(listener);
	}
	
	public void desincrever(Listener listener) {
		listeners.remove(listener);
	}
	
	public void notificar(PedidoInterface pedido) {
		listeners.forEach(listener -> listener.update(pedido));
	}
}
