import javax.swing.JOptionPane;

public class ejercicio10App {

	public static void main(String[] args) {

		//Solicitamos las dimensiones del Array y convertimos los datos a valor numérico
		String tamañoString = JOptionPane.showInputDialog("introduce el tamaño del array");
		int tamañoArray = Integer.parseInt(tamañoString);
		
		//creamos un array con las dimensiones solicitadas
		int arreglo[] = new int[tamañoArray];

		//solicitamos  el rango minimo del randomizador que usaremos mas adelante y convertimos los datos a valor numérico 
		String numMinimoString = JOptionPane.showInputDialog("introduce el rango minimo");
		int numMinimo = Integer.parseInt(numMinimoString);

		//solicitamos  el rango maximo del randomizador que usaremos mas adelante y convertimos los datos a valor numérico
		String numMaximoString = JOptionPane.showInputDialog("introduce el rango maximo");
		int numMaximo = Integer.parseInt(numMaximoString);

		//llamamos al metodo Input
		metodoInput(arreglo, numMinimo, numMaximo);

		//llamamos al metodo Output
		metodoOutput(arreglo);
		
		//llamamos al metodo Caballo Ganador
		metodoCaballoGanador(arreglo);

	}
	//el metodo input nos rellenara el Array con numeros random (dentro de este metodo llamaremos a otro metodo para seleccionar los numeros primos)
	public static void metodoInput(int[] arreglo, int numMinimo, int numMaximo) {

		//creamos un loop para rellenar el Array
		for (int i = 0; i < arreglo.length; i++) {

			int numerosRandom = (int) (numMinimo + (Math.random() * numMaximo)); //creamos nueros random con el rango solicitado anteriormente
			int aux = numerosRandom;

			funcionPrimos(arreglo, numerosRandom, aux);
			if (funcionPrimos(arreglo, numerosRandom, aux) == 2)

				arreglo[i] = numerosRandom;
			else
				i--;

		}

	}
	//creamos una funcion para revisar si los numeros generados Random, son primos y pueden ingresar al array
	public static int funcionPrimos(int[] arreglo, int numerosRandom, int aux) {//traemos como parametros al arreglo, la variable "numeros random" y un auxiliar)

		//para comprobar si un numero es random usaremos un if:
		if (aux > 0) { //primero, nos aseguramos de que el numero sea mayor que 0 
			if (numerosRandom % aux == 0) //si el resto del numero random entre el auxiliar es igual a 0
				return 1 + funcionPrimos(arreglo, numerosRandom, aux - 1);//volvemos a invocar esta funcion, sumando 1 a toda la funcion y restando 1 al auxiliar
																		//
			
			return funcionPrimos(arreglo, numerosRandom, aux - 1);

		} else {
			return 0;
		}
	}
	//creamos el metodo Output para imprimir todos los numeros (previamente seleccionados como primos) que se han guardado en el Array
	public static void metodoOutput(int[] arreglo) {
		
	
		
		//imprimimos un texto comunicando los numeros filtrados que apareceran a continuacion
		System.out.println("los numeros Primos que se han almacenado son los siguientes:\n"); 
		for (int i = 0; i < arreglo.length; i++) {

			System.out.println(arreglo[i]); //imprimimos los resultados

		}
				
	}
	//en este metodo seleccionaremos el numero mayor de entre todos los numeros seleccionados
	public static void metodoCaballoGanador(int[] arreglo) {

		int mayor = arreglo[0]; //declaramos la variable "mayor" en la posicion inicial del array
		
		for(int i=1; i<arreglo.length;i++){ //creamos un loop para recorrer el arreglo
			
			if (arreglo[i]>mayor) { //si el array en la posicion "i" es mayor al valor de "mayor"
				mayor = arreglo[i]; //entonces en "mayor" se almancena ese valor y se repite el loop
									//hasta que se han comparado todos los valores
			}
		}
		System.out.println();//imprimimos un espacio separador
		System.out.println("El numero Primo mayor es: "+mayor);//finalmente imprimimos al numero mayor, guardado en la variable "mayor"
	}
	
}
