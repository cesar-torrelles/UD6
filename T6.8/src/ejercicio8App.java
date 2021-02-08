import javax.swing.JOptionPane;

public class ejercicio8App {

	public static void main(String[] args) {
		
		//creamos un arreglo con 10 posiciones
		int arreglo[] = new int [10];
		
		//llamamos al metodo input 
		metodoInput(arreglo);
		
		//llamamos al metodo output 
		metodoOutput(arreglo);
		
	}	
		//creamos el metodo Input para introducir todos los datos en el arreglo
    	public static void metodoInput(int[] arreglo) {
    		
    		//usamos un loop para recorrer el arreglo
    		for(int i=0;i<arreglo.length;i++) {
    			
    		//solicitamos ingresar los datos en cada "casilla" del array, 
    		//luego convertimos los valores a numero Int 
    		String numeroString = JOptionPane.showInputDialog("introduce un numero en la casilla: "+(i+1));
            int numeros = Integer.parseInt(numeroString); 
            
            //introducimos los valores en el arreglo por orden de ingreso
            arreglo[i] = numeros;
            
            
    		}
    	}
    	//creamos otro metodo llamado Output para imprimir todos los valores almacenados en el arreglo
    	public static void metodoOutput(int[] arreglo) {
    		
    		//comunicamos en terminal los numeros que se han almacenado:
    		System.out.println("los numeros que has almacenado son los siguientes:");
    		
    		//creamos un loop para recorrer el arreglo
    		for(int i=0;i<arreglo.length;i++) {
    			
    		//imprimimos los valores conforme se recorre el arreglo    		
    		System.out.println(arreglo[i]);
                        
            
    		}
    	
    	
    		
    	}
}

        
        
		
		
		
	


