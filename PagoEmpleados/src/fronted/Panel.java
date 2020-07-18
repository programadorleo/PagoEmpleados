package fronted;

import java.awt.*;

import javax.swing.*;

public class Panel extends JPanel {

	public Panel() {

		JLabel tituloPrincipal = new JLabel("PAGO DE EMPLEADOS");
		tituloPrincipal.setBounds(120, 10, 160, 20);

		JLabel labelEmpleado = new JLabel("EMPLEADO");
		labelEmpleado.setBounds(20, 60, 100, 20);

		JTextField campoEmpleado = new JTextField(30);
		campoEmpleado.setBounds(120, 60, 200, 20);

		JLabel labelHoras = new JLabel("HORAS");
		labelHoras.setBounds(20, 100, 50, 20);

		JTextField campoHoras = new JTextField(5);
		campoHoras.setBounds(80, 100, 50, 20);

		JLabel labelTarifa = new JLabel("TARIFA");
		labelTarifa.setBounds(150, 100, 50, 20);

		JTextField campoTarifa = new JTextField(5);
		campoTarifa.setBounds(200, 100, 50, 20);

		JButton botonMostrar = new JButton("MOSTRAR");
		botonMostrar.setBounds(40, 150, 100, 30);

		JButton botonLimpiar = new JButton("LIMPIAR");
		botonLimpiar.setBounds(200, 150, 100, 30);

		TextArea areaTexto = new TextArea();
		areaTexto.setBounds(30, 200, 300, 100);

		setLayout(null);

		add(tituloPrincipal);

		add(labelEmpleado);

		add(campoEmpleado);

		add(labelHoras);

		add(campoHoras);

		add(labelTarifa);

		add(campoTarifa);

		add(botonMostrar);

		add(botonLimpiar);

		add(areaTexto);

	}

}
