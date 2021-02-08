import javax.swing.JOptionPane;

public class ejercicio9App {

	public static void main(String[] args) {

		//solicitamos el tamaño del array y lo convertimos a valor numerico
		String tamañoString = JOptionPane.showInputDialog("introduce el tamaño del array");
		int tamañoArray = Integer.parseInt(tamañoString);
		
		//creamos un array con el tamaño solicitado
		int arreglo[] = new int[tamañoArray];
		
		//creamos dos variables con el rango minimo y maximo
		int numMinimo = 0;
		int numMaximo = 9;

		//llamamos al metodo Input para introducir los datos en el Array
		metodoInput(arreglo, numMinimo, numMaximo);

		//llamamos al metood Output para imprimir los datos del Array
		metodoOutput(arreglo);

	}
	//en el metodo Input introducimos numeros random en el array
	public static void metodoInput(int[] arreglo, int numMinimo, int numMaximo) {//importamos los parametros del array, y los rangos minimo y maximo
		
		//usamos un loop for para recorrer el array
		for (int i = 0; i < arreglo.length; i++) {

			int numerosRandom = (int) (numMinimo + (Math.random() * numMaximo)); //creamos numeros random, usando como rango los valores solicitados anteriormente

			arreglo[i] = numerosRandom; //guardamos los datos en el array 

		}
	}

	//creamos otro metodo llamado Output para imprimir todos los datos almacenados en el array
	public static void metodoOutput(int[] arreglo) {//importamos los parametros del arreglo

		//creamos una variable donde realizaremos todas las sumas
		int suma = 0;
		System.out.println("los numeros que se han almacenado son los siguientes:\n");//comunicamos por terminal que se mostraran los numeros almacenados
		for (int i = 0; i < arreglo.length; i++) {

			//creamos una variable donde guardaremos los valores del arreglo en la posicion del iterador
			int numeros = arreglo[i];

			//realizamos la suma y lo almacenamos en la variable "suma"
			suma = suma + numeros;

			//imprimimos los numeros del array
			System.out.println(numeros);

		}
		
		//finalmente imprimimos un espacio y un comunicado con la total de los numeros almacenados en el array
		System.out.println();
		System.out.println("la suma de los numeros da: " + suma);

	}
}
