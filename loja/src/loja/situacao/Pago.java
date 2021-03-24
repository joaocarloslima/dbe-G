package loja.situacao;

import loja.PedidoInterface;

public class Pago extends Situacao{

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("abrindo chamado para logistica");
	}

	@Override
	public void entregar(PedidoInterface pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(PedidoInterface pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	

}
