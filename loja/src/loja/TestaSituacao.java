package loja;

import java.math.BigDecimal;

public class TestaSituacao {

	public static void main(String[] args) {
		PedidoInterface pedido = 
				new PedidoProxy( new Pedido(new BigDecimal("100")) );
//		pedido.handler.inscrever(new EmailListener());
//		pedido.handler.inscrever(new LogListener());
		pedido.abrirChamado();
		
		System.out.println(pedido.getEndereco());
		
		System.out.println(pedido.getSituacao());

		pedido.pagar();
		System.out.println(pedido.getSituacao());

		pedido.entregar();
		System.out.println(pedido.getEndereco());
		System.out.println(pedido.getSituacao());
		
		//pedido.reabrir();
		
		
	}
}
