import javax.swing.JOptionPane;

public class ejercicio3App {

	public static void main(String[] args) {

		// solicitamos la cantidad de numeros Random que queremos
		String numeroString = JOptionPane.showInputDialog("Dime un numero");

		// convertimos el valor en un numero entero
		int num1 = Integer.parseInt(numeroString);
		
		int num2 = num1;
		
		//llamamos a la funcion "funcionPrimos"		
		funcionPrimos(num1,num2);
		
		//si la funcion da 2 se trata de un numero primo, se imprime por pantalla
		if(funcionPrimos(num1, num2) == 2)
            System.out.println("El numero seleccionado es primo");
		
		//si no da 2, se imprimie por terminal que el numero no es primo
        else
            System.out.println("El numero seleccionado no es primo");

	}

	//creamos una funcion para determinar si es primo el numero 
	public static int funcionPrimos(int num1, int num2) {

	    if (num2 > 0) { //primero aseguramos que num2 se trate de un numero igual o superior a 0
	        if(num1 % num2 == 0) //en ese caso si el resto de num1 entre num2 da 0, se trata de un numero primo 
	            return 1+funcionPrimos(num1, num2-1); //se retorna la funcion +1 y num2-1 dando como resultado 2
	        
	        //si no es el caso se retorna la funcion  con num2-1 dando como resultado 2
	        return funcionPrimos(num1, num2-1);
	     
	    // si no se cumplen esas condiciones  retorna 0
	    }else {
	        return 0;
	    }
	}

}
