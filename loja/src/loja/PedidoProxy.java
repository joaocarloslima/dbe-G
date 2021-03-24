package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public class PedidoProxy implements PedidoInterface{
	
	private Pedido pedido;
	private String endereco;

	public PedidoProxy(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getEndereco() {
		if (endereco == null) {
			endereco = pedido.getEndereco(); 
		}
		return endereco;
	}

	public String getCep() {
		return pedido.getCep();
	}

	public void setCep(String cep) {
		pedido.setCep(cep);
	}


	public void abrirChamado() {
		
		pedido.abrirChamado();
		
	}

	public BigDecimal getValor() {
		return pedido.getValor();
	}

	public int getQuantidadeDeItens() {
		return pedido.getQuantidadeDeItens();
	}

	public void setSituacao(Situacao situacao) {
		pedido.setSituacao(situacao);
	}

	public void pagar() {
		pedido.pagar();
	}

	public void entregar() {
		pedido.entregar();
	}

	public void cancelar() {
		pedido.cancelar();
	}

	public void reabrir() {
		pedido.reabrir();
	}

	public Situacao getSituacao() {
		return pedido.getSituacao();
	}
	
	

}
