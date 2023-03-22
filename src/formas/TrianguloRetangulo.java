package formas;

import interfaces.ITrianguloRetangulo;

public class TrianguloRetangulo implements ITrianguloRetangulo{
	private double base;
	private double altura;
	
	public TrianguloRetangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getBase() {		
		return this.base;
	}

	@Override
	public double getAltura() {
		return this.altura;
	}

	@Override
	public void setBase(double b) {
		this.base = b;		
	}

	@Override
	public void setAltura(double a) {
		this.altura = a;
	}

	@Override
	public double getArea() {
		return this.base * this.altura / 2;
	}

	@Override
	public double getPerimetro() {
		return this.base + this.altura + this.calculeHipotenusa();
	}
		
	public double calculeHipotenusa() {
		double soma = this.base * this.base + this.altura * this.altura;
		return Math.sqrt(soma);
	}
	
}
