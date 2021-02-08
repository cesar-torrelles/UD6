import javax.swing.JOptionPane;

public class ejercicio4App {

	public static void main(String[] args) {

		//solicitamos un numero por pantalla
		String numeroString = JOptionPane.showInputDialog("Dime un numero");

		//lo convertimos en valor numerico Integer
		int numero = Integer.parseInt(numeroString);
		
		//llamamos al metodo "factorial"
		factorial(numero);
		//aqui imprimiremos el resultado de la operacion del metodo factorial
		JOptionPane.showMessageDialog(null, "el factorial de ese numero es " + factorial(numero));

	}
	// este es el metodo factorial que hemos creado
	public static int factorial(int num) {

		//creamos un array llamado "arreglo" con las dimensiones de la cantidad de numeros que se solicitaron al principio
		int arreglo[] = new int[num];
		
		//creamos tambien dos contadores:
		
		// i nos servira para añadir un numero inferior al arreglo
		int i = 0;
		// j nos servira para ir desplazando el indice de nuestro arreglo
		int j = 0;

		//usamos un loop while para rellenar nuestro arreglo con numeros inferiores al solicitado 
		while (i < num) {

			arreglo[j] = num - i;

			i++;
			j++;

		}

		//luego usaremos otro loop para que realice la multiplicacion
		// a parte de un contador, declaramos una variable mas donde guardaremos la multiplicacion
		
		//k1 nos servira para indicar el numero siguiente del array
		int k = 1;
		//la multiplicacion se iniciara con el valor de la posicion 0 de nuestro arreglo, que equivale al valor solicitado
		int multiplicacion = arreglo[0];

		while (k < num) {

			//guardaremos en la multiplicacion el resultado de su valor inicial por el arreglo en las posiciones siguientes
			multiplicacion = (multiplicacion * (arreglo[k]));

		
			k++;

		}
		//finalmente devolveremos el resultado de la multiplicacion al main donde se imprimira el resultado
		return multiplicacion;

	}

}
