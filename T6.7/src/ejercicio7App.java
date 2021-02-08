import javax.swing.JOptionPane;

public class ejercicio7App {

	public static void main(String[] args) {

		
		//solicitamos la cantidad de euros que se deseen cambiar y lo convertimos a valor numerico

        String numeroString = JOptionPane.showInputDialog("introduce la cantidad de Euros que deseas cambiar");
        double cantidad = Double.parseDouble(numeroString); 
        
      //solicitamos la moneda a la que se desee cambiar. Se muestran las opciones  
        String moneda = JOptionPane.showInputDialog("introduce la moneda a la que deseas cambiar tus Euros: \n(puedes elegir entre libras, dolares o yenes)");

        //llamamos al metodo CambioDivisas
        cambioDivisas(cantidad,moneda);
        
	} 
		//Creamos un metodo llamado "cambioDivisas" donde haremos el calculo del cambio en funcion de la palabra ingresada
    	public static void cambioDivisas(double cantidad, String moneda) {
    		
    		  //creamos un switch que nos permitira realizar una operacion u otra 
    		//en funcion de lo que se ha ingresado en la variable "moneda"
    		switch (moneda) {
    		
    		//en el caso de cada tipo de moneda, nos realizara la multiplicacion correspondiente y nos lo comunicara 
    		case "libras":JOptionPane.showMessageDialog(null, "el cambio te sale a " +cantidad*0.86 + ""+"£");
    		break;
    		case "dolares":JOptionPane.showMessageDialog(null, "el cambio te sale a " +cantidad*1.28611 + ""+"$");
    		break;
    		case "yenes":JOptionPane.showMessageDialog(null, "el cambio te sale a " +cantidad*129.852 + ""+"¥");
    		break;
    		//en el caso de que la palabra no coincida con las opciones se comunicara un aviso de que no se ha introducido correctamente
    		default:JOptionPane.showMessageDialog(null, "parece ser que no has introducido la moneda correctamente");
    		
    		}
    		

	}

}
