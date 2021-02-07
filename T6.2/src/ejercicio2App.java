import javax.swing.JOptionPane;

public class ejercicio2App {

	public static void main(String[] args) {

		//llamamos el metodo aleatorio desde el Main
		aleatorio();

	}

	// creamos el metodo aleatorio
	public static void aleatorio() {

		//solicitamos la cantidad de numeros Random que queremos
		String cantidad = JOptionPane.showInputDialog("Cuantos numeros Random quieres?");

		//convertimos el valor en un numero entero
		int cantidadNum = Integer.parseInt(cantidad);
		
		//indicamos donde empezara el contador de nuestro loop while que nos permitira imprimir la cantidad de numeros introducida
		int i = 1;

		//declaramos que el loop while no finalice hasta que hayamos imprimido todos numeros deseados
		while (i <= cantidadNum) {
			
			int valor1, valor2;
			//solicitamos por pantalla el valor mas bajo del numero
			String valor1string = JOptionPane.showInputDialog("dame el rango mas bajo del numero " + i);
			//lo convertimos en un numero entero
			valor1 = Integer.parseInt(valor1string);
			
			//solicitamos por pantalla el valor mas alto del numero
			String valor2string = JOptionPane.showInputDialog("dame el rango mas alto del numero " + i);
			//lo convertimos en un numero entero
			valor2 = Integer.parseInt(valor2string);

			//guardamos el valor resultante en una variable
			int numeroRandom = (int) (valor1 + (Math.random()*valor2));

			//y lo imprimimos 
			System.out.println("Numero random " + i + " es: " + numeroRandom);
			
			//sumamos 1 en el contador hasta cumplir la condicion dada
			i++;

		}

	}

}
