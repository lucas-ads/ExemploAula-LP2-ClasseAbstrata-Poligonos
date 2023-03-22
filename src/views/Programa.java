package views;

import java.util.ArrayList;
import java.util.List;

import formas.Circulo;
import formas.Forma;
import formas.FormaBidimensional;
import formas.Quadrado;

public class Programa {

	public static void main(String[] args) {
		
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
		
		//Falta especificar os métodos abstratos getArea() e getPerimetro() na classe
		//FormaBidimensional e implementá-los na classe Circulo.
		
		/*Triangulo triangulo = null;// = new T
		
		triangulo.setAltura(10);
		triangulo.setBase(15);
		triangulo.setCor("Azul");
		
		System.out.println("Área do triângulo: " + triangulo.getArea());*/
		
	}

}








