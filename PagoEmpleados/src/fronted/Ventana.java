package fronted;


import javax.swing.*;

public class Ventana extends JFrame {

	public static int inicioX = 600;
	public static int inicioY = 350;
	public static int largoVentana = 400;
	public static int altoVentana = 600;

	public Ventana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Pago empleados");

		setBounds(inicioX, inicioY, largoVentana, altoVentana);

		Panel miPanel = new Panel();

		add(miPanel);

	}

}
