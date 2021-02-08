

import javax.swing.JOptionPane;

public class ejercicio6App {
	
    public static void main(String[] args){
    	
    	//solicitamos por pantalla un numero igual o mayor a 0
        String numeroString = JOptionPane.showInputDialog("Dime un numero entero mayor o igual a 0");
        //convertimos el resultado a valor numerico y lo guardamos en la variable "numero"
        int numero = Integer.parseInt(numeroString);          
        
        //llamamos al metodo "numeroDeCifras"
        numeroDeCifras(numero);
        
        //finalmente comunicamos la cantidad de cifras que tiene el numero introducido
		JOptionPane.showMessageDialog(null,"El número tiene " + numeroDeCifras(numero)+ " cifra(s)");

        
    }    
    //creamos una funcion que nos permita realizar una cuenta de las cifras del numero introducido
    public static int numeroDeCifras(int numero) { //importamos los parametros del numero solicitad
  
    		//creamos dos variables, n y cifras
    		int n, cifras;
    		            		
            n = numero; //n sera igual al numero solicitado
            cifras= 0;    //cifras realiza el conteo
            while(n!=0){             //creamos un loop con la condicion de que mientras a n le queden cifras continue
                    n = n/10;         //le quitamos el último dígito dividiendolo entre 10
                   cifras++;          //sumamos 1 al contador de cifras
            }
            return cifras; //devolvemos el valor de "cifras"
        }
    }
