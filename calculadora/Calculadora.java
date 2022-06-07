package br.com.pelodan.console.calculadora;

public class Calculadora {
	private Double valor = 0.0;
	private Double segundoValor = 0.0;
	private String operacao;
	
	public Double resultado() {
		if (operacao.equals("+")) {
			return valor + segundoValor;
		} else if(operacao.equals("-")){
			return valor - segundoValor;
		} else if(operacao.equals("*")){
			return valor * segundoValor;
		} else if(operacao.equals("/")){
			return valor / segundoValor;
		} 
		else {
			return 0.0;
		}	
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getSegundoValor() {
		return segundoValor;
	}
	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
}
