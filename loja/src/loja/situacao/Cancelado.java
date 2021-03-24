package loja.situacao;

import loja.PedidoInterface;

public class Cancelado extends Situacao {

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		new ChamadoFacade().abrir();
		System.out.println("abrindo chamado para comercial");
	}

	@Override
	public void reabrir(PedidoInterface pedido) {
		pedido.setSituacao(new Aberto());
	}
	
	

}
