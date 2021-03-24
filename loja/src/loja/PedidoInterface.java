package loja;

import java.math.BigDecimal;

import loja.situacao.Situacao;

public interface PedidoInterface {

	String getCep();

	void setCep(String cep);

	String getEndereco();

	void abrirChamado();

	BigDecimal getValor();

	int getQuantidadeDeItens();

	void setSituacao(Situacao situacao);

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

	Situacao getSituacao();

}