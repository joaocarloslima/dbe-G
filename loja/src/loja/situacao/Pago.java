package loja.situacao;

import loja.Pedido;

public class Pago extends Situacao{

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("abrindo chamado para logistica");
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	

}
