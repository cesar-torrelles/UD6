import javax.swing.JOptionPane;

public class ejercicio3App {

	public static void main(String[] args) {

		// solicitamos la cantidad de numeros Random que queremos
		String numeroString = JOptionPane.showInputDialog("Dime un numero");

		// convertimos el valor en un numero entero
		int numero = Integer.parseInt(numeroString);

		int otronumero = numero;
		
				
		funcionPrimos(numero,otronumero);
		
		if(funcionPrimos(numero, otronumero) == 2)
			
            System.out.println("Es primo");
        else
        	
            System.out.println("No es primo");

	}

	// creamos el metodo aleatorio
	
	public static int funcionPrimos(int numPrimo, int aux) {

	    if (aux > 0) {
	        if(numPrimo % aux == 0)
	            return 1+funcionPrimos(numPrimo, aux-1);
	        return funcionPrimos(numPrimo, aux-1);

	    }else {
	        return 0;
	    }
	}

}
