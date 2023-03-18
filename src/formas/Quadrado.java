package formas;

public class Quadrado extends FormaBidimensional{
	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public Quadrado(double lado, String cor, String corBorda, double espBorda) {
		super(cor, corBorda, espBorda);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return this.lado * this.lado;
	}

	public double getPerimetro(){
		return this.lado * 4;
	}
	
	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() + ":\nLado = " + this.lado + "\n";
	}
}
