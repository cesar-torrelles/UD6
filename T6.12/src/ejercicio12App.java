import javax.swing.JOptionPane;

public class ejercicio12App {

	public static void main(String[] args) {

		//Solicitamos las dimensiones del Array y convertimos los datos a valor numérico
		String tamañoString = JOptionPane.showInputDialog("introduce el tamaño del array");
		int tamañoArray = Integer.parseInt(tamañoString);
		
		//creamos un array con las dimensiones solicitadas
		int arreglo[] = new int[tamañoArray];
		
		//creamos dos variables con el rango del randomizador que usaremos mas adelante
		int numMinimo = 1;
		int numMaximo = 300;
		
		//solicitamos introducir el digito que se desea usar para filtrar los numeros y que nos presente mas adelante solo los
		//que acaban en ese digito. 
		String queAcabeEnString = JOptionPane.showInputDialog("introduce el valor de los numeros que deseas filtrar");
		//Convertimos a valor numerico el digito soliciado
		int queAcabeEn = Integer.parseInt(queAcabeEnString);

		//creamos un loop donde vamos a rellenar la matriz de numeros Random
		for (int i = 0; i < arreglo.length; i++) {

			int numerosRandom = (int) (numMinimo + (Math.random() * numMaximo)); //añadimos los minimos y maximos solicitados al principio

			arreglo[i] = numerosRandom; //guardamos los valores en la matriz

			
		}
		//llamamos al metodo que nos filtraria los numeros que deseamos
		acabaEn(arreglo, queAcabeEn, tamañoArray);

	}
	//Creamos un metodo para filtrar los numeros que deseamos obtener del Array
	public static void acabaEn(int[] arreglo, int queAcabeEn, int tamañoArray) {

		//imprimimos un texto comunicando los numeros filtrados que apareceran a continuacion
		System.out.println("los numeros acabados con las cifras solicitadas son: "); 
		
		for (int i = 0; i < arreglo.length; i++) { //creamos un loop

			int n = arreglo[i];                    //creamos una nueva variable para copiar los valores del Array en cada punto de su recorrido
			int[] arreglo2 = new int[tamañoArray]; //creamos otro Array con las mismas dimensiones que el Array principal

			if (n % 10 == queAcabeEn) {    	//si el resultado de aplicar el modulo entre 10 al numero almancenado coincide con el numero deseado 
										    //quiere decir que ese numero acaba en la cifra deseada
				arreglo2[i] = arreglo[i];   // por lo tanto se guarda en el nuevo arreglo

				System.out.println(arreglo2[i]); // y se imprime en terminal

			}
		}

	}

}
