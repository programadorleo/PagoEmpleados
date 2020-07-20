package fronted;


import javax.swing.*;

public class Ventana extends JFrame {

	private static int inicioX = 600;
	private static int inicioY = 350;
	private static int largoVentana = 400;
	private static int altoVentana = 500;

	public Ventana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Pago empleados");

		setBounds(inicioX, inicioY, largoVentana, altoVentana);
		
		Lamina miLamina = new Lamina();
		
		add(miLamina);

	}

}
