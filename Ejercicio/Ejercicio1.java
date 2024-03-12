package Ejercicio;

public class Ejercicio1 {
	 public double calcularArea(String forma, double medida1, double medida2) {
	 double area = 0;
	 if (forma.equalsIgnoreCase("circulo")) {
	 area = Math.PI * medida1 * medida1;
	 } else if (forma.equalsIgnoreCase("cuadrado")) {
	 area = medida1 * medida1;
	 } else if (forma.equalsIgnoreCase("triangulo")) {
	 area = (medida1 * medida2) / 2;
	 }
	 return area;
	 }
	 public static void main(String[] args) {
	 Ejercicio1 calculadora = new Ejercicio1();

	 // Calculamos el área del círculo
	 double areaCirculo = calculadora.calcularArea("circulo", 5, 0);
	 System.out.println("Área del círculo: " + areaCirculo);

	 // Calculamos el área del cuadrado
	 double areaCuadrado = calculadora.calcularArea("cuadrado", 4, 0);
	 System.out.println("Área del cuadrado: " + areaCuadrado);

	 // Calculamos el área del triángulo
	 double areaTriangulo = calculadora.calcularArea("triangulo", 3, 4);
	 System.out.println("Área del triángulo: " + areaTriangulo);
	 }
	}

