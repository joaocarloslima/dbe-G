package loja;

public class LogListener implements Listener{

	@Override
	public void update(Pedido pedido) {
		System.out.println("Log do pedido " + pedido);
	}

}
