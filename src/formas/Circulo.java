package formas;

public class Circulo extends FormaBidimensional{
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	public Circulo(double raio, String cor, String corBorda, double espBorda) {
		super(cor, corBorda, espBorda);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public String toString() {
		return super.toString() + this.getClass().getSimpleName() + ":\nRaio = " + this.raio + "\n";
	}
}
