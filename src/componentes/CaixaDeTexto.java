package componentes;

import interfaces.Redimensionavel;

public class CaixaDeTexto implements Redimensionavel{
	private String texto;
	private double tamanhoFonte;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public double getTamanhoFonte() {
		return tamanhoFonte;
	}
	public void setTamanhoFonte(double tamanhoFonte) {
		this.tamanhoFonte = tamanhoFonte;
	}
	
	@Override
	public void redimensiona(double coeficiente) {
		this.tamanhoFonte = this.tamanhoFonte * coeficiente;
	}
	
	@Override
	public String toString() {
		return String.format("-Caixa de Texto:\nConteúdo: %s\nTamanho da Fonte: %s\n", this.getTexto(), this.getTamanhoFonte()); 
	}
	
}
