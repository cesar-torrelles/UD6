import javax.swing.JOptionPane;

public class ejercicio11App {

	public static void main(String[] args) {
		
		//Solicitamos las dimensiones del Array y convertimos los datos a valor numérico		
		String tamañoString = JOptionPane.showInputDialog("introduce el tamaño del array");
		int tamañoArray = Integer.parseInt(tamañoString);
		
		//Solicitamos introducir el valor alto del rango de randomización y convertimos los datos en valor numérico
		String rangoString = JOptionPane.showInputDialog("los Arrays se randomizaran entre los valores 0 y: ");
		int rango = Integer.parseInt(rangoString);
		
		//creamos 3 arrays:
		//El primero tendrá los valores random, el segundo copiará los valores del primero y luego se randomiza
		//y el tercero almacenará la multiplicación de los otros dos
		//los tres arrays aprovechan el mismo valor de las dimensiones introducidas
		int[] array1 = new int [tamañoArray];
		int[] array2 = new int [tamañoArray];
		int[] array3 = new int [tamañoArray];
		
		//creamos un loop para introducir los datos random en el primer array
		for (int i = 0; i < array1.length; i++) {

			int numerosRandom = (int) (Math.random() * rango);//aquí generamos los números random
			
			array1[i]=numerosRandom; //aquí almacenamos esos números en el Array1
			array2[i]=array1[i];    //aquí guardamos los valores que se van almacenando en Array1, en Array2
		}
		
		//creamos otro loop para randomizar los valores del Array2
		for (int i = 0; i < array2.length; i++) {

			int numerosRandom = (int) (Math.random() * rango);
			
			array2[i]=numerosRandom;
		}
		
		//hacemos la llamada del Método para que se ejecute después de los loops
		metodoMultiplicacionArrays(array1,array2,array3);
	}
	
	//Creamos un Método para  multiplique los valores de Array1 y de Array2, los almacene en Array 3
	//y luego imprima todos los valores resultantes en pantalla
	public static void metodoMultiplicacionArrays(int[] array1, int[] array2, int[] array3) {
		
		for (int i = 0; i < array1.length; i++) {
			
			//multiplicamos los valores de Array1 con Array2, con el índice en sincronía y lo guardamos en Array 3
			array3[i]=array1[i]*array2[i];
			
			//Imprimimos el resultado en terminal
			System.out.println(array3[i]); 
			
		}

		
	}


}
