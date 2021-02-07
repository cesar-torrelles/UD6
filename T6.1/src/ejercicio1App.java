import javax.swing.JOptionPane;

public class ejercicio1App {

	public static void main(String[] args) {
		
		// solicitamos la figura que deseamos calcular
		String figura = JOptionPane
				.showInputDialog("Calcula el area de una figura. " + "Opciones: circulo, triangulo o cuadrado");

		//añadimos un condicional if elseif para que ejecute el metodo adecuado en funcion de la figura
		if(figura.equals("circulo")) {
			
			//si la palabra introducida es "circulo" llamamos este metodo
			circulo();
		}
		
		else if(figura.equals("triangulo")) {
			
			//si la palabra introducida es "triangulo" llamamos este metodo
			triangulo();
		}
		
		else if(figura.equals("cuadrado")) {
			
			//si la palabra introducida es "circulo" llamamos este metodo
			cuadrado();
		}
		//si se introducen palabras no deseadas se recomienda escojer entre las opciones
		else {JOptionPane.showMessageDialog(null,"escoje entre las opciones");
}
		
		
	}
	//creamos un metodo para el circulo donde solicitamos introducir el radio
	public static void circulo() {

		double radio;
		String radiostring = JOptionPane.showInputDialog("escribe el radio del circulo");
		radio = Double.parseDouble(radiostring);
		double area = Math.pow(radio, 2) * Math.PI;
		
		//mandamos a imprimir en pantalla el resultado
		JOptionPane.showMessageDialog(null,"el resultado es "+area);

	}
	//creamos un metodo para el triangulo donde solicitamos introducir la base y la altura
	public static void triangulo() {

		double base, altura, area;
		String basestring = JOptionPane.showInputDialog("escribe la base del triangulo");
		base = Double.parseDouble(basestring);
		String alturastring = JOptionPane.showInputDialog("escribe la altura del triangulo");
		altura = Double.parseDouble(alturastring);
		area = (base * altura)/2;
		
		//mandamos a imprimir el resultado
		JOptionPane.showMessageDialog(null,"el resultado es "+area);
	}
	
	//creamos un metodo para el cuadrado donde solicitamos introducir los lados
	public static void cuadrado() {

		double lado1, lado2;
		String lado1string = JOptionPane.showInputDialog("escribe el lado 1 del cuadrado");
		lado1 = Double.parseDouble(lado1string);
		String lado2string = JOptionPane.showInputDialog("escribe el lado 2 del cuadrado");
		lado2 = Double.parseDouble(lado2string);
		double area = lado1 * lado2;
		
		//mandamos a imprimir el resultado
		JOptionPane.showMessageDialog(null,"el resultado es "+area);

	}

}
