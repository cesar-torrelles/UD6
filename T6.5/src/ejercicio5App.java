import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio5App {

	
	
	public static void main(String[] args) {
		
			//creamos las siguientes variables en formato entero
	        int numero, exp, digito;
	        
	        //y  la variable "binario" en formato double
	        double binario;
	        
	        //solicitamos por pantalla el numero que deseamos convertir a binario
	        String numeroString = JOptionPane.showInputDialog("Dime un numero entero mayor o igual a 0");
	        //convertimos el valor en numerico
	        numero = Integer.parseInt(numeroString);

	        //creamos un loop donde comprobamos si el numero es entero y mayor o igual a 0
	        while(numero < 0) {
	        
	        //si no es asi, lo comunicamos por pantalla y solicitamos ingresarlo de nuevo
	        String numeroString2 = JOptionPane.showInputDialog("ha de ser un numero entero mayor o igual a 0");
	        
	        //convirtiendo el resultado de nuevo en valor numerico
	        numero = Integer.parseInt(numeroString2);
	        }
	        
	        //creamos dos variables llamadas "exp y binario", las igualamos a cero
	        	exp=0;
	        	binario=0;
	        	
	        	//creamos un loop que se cumpla mentras el valor ingresado "numero" sea diferente de 0
	        	while(numero!=0){
	                digito = numero % 2; 							//para conseguir el digito realizamos el resto la variable "numero" entre 2          
	                binario = binario + digito * Math.pow(10, exp); //indicamos que binario sea la suma de si mismo mas 
	                												//el valor de digito, multiplicando digito por la potencia en base 10 del exponente "exp"                                                  
	                exp++;                                         //incrementamos el valor del exponente en 1
	                numero = numero/2;                             // dividimos "numero" entre dos
	                												// y repetimos el bucle hasta que "numero" sea diferente de 0
	        }
	       //despues del loop convertimos la variable "binario" en entera
	        int binarioInt = (int) binario;
	        
	        //finalmente imprimimos el valor obtenido en la variable "binarioInt"
		    JOptionPane.showMessageDialog(null,"el numero en binario es "+binarioInt);
	    }
	}