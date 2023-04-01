package views;

import java.util.ArrayList;
import java.util.List;

import componentes.CaixaDeTexto;
import formas.Circulo;
import formas.Forma;
import formas.FormaBidimensional;
import formas.Quadrado;
import formas.TrianguloRetangulo;
import interfaces.ITrianguloRetangulo;
import interfaces.Redimensionavel;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("\n############### Testando classes abstratas ###############\n");
		
		List<FormaBidimensional> poligonos = new ArrayList<FormaBidimensional>();
		
		Quadrado quad1 = new Quadrado(5);
		Quadrado quad2 = new Quadrado(7);
		Quadrado quad3 = new Quadrado(10);
		
		Circulo circ1 = new Circulo(5);
		Circulo circ2 = new Circulo(7);
		Circulo circ3 = new Circulo(10);
		
		poligonos.add(quad1);
		poligonos.add(quad2);
		poligonos.add(quad3);
		
		poligonos.add(circ1);
		poligonos.add(circ2);
		poligonos.add(circ3);
		
		for(FormaBidimensional fb : poligonos){
			System.out.println( fb.toString() );
			System.out.println( "Área: " +  fb.getArea() + "\n");
		}
		
		System.out.println("\n############### Testando a interface ITrianguloRetangulo ###############\n");
		
		ITrianguloRetangulo tr = new TrianguloRetangulo(0, 0);
		
		tr.setBase(8);
		tr.setAltura(5);
		System.out.println("Base: " + tr.getBase());
		System.out.println("Altura: " + tr.getAltura());
		System.out.println("Área: " + tr.getArea());
		System.out.println("Perímetro: " + tr.getPerimetro());
		
		System.out.println("\n############### Testando generalização de tipo com a interface Redimensionavel ###############\n");
		
		List<Redimensionavel> objetos = new ArrayList<Redimensionavel>();
		
		CaixaDeTexto ct = new CaixaDeTexto();
		ct.setTexto("Counter-Terrorist");
		ct.setTamanhoFonte(12);
		
		Forma quadrado = new Quadrado(5);
		
		Redimensionavel circulo = new Circulo(8);
		
		objetos.add(ct);
		objetos.add(quadrado);
		objetos.add(circulo);
		
		for(Redimensionavel ob : objetos) {
			ob.redimensiona(1.5);
		}
		
		for(Redimensionavel ob : objetos) {
			System.out.println(ob.toString() + '\n');
		}
		
	}

}



















