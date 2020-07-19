package fronted;

import backend.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Panel extends JPanel {

	private String nombre;

	private double horasTrabajadas = 0;

	private double tarifa = 0;

	JLabel tituloPrincipal = new JLabel("PAGO DE EMPLEADOS");

	JLabel labelEmpleado = new JLabel("EMPLEADO");

	JTextField campoEmpleado = new JTextField(30);

	JLabel labelHoras = new JLabel("HORAS");

	JTextField campoHoras = new JTextField(5);

	JLabel labelTarifa = new JLabel("TARIFA");

	JTextField campoTarifa = new JTextField(5);

	JButton botonMostrar = new JButton("MOSTRAR");

	JButton botonLimpiar = new JButton("LIMPIAR");

	TextArea areaTexto = new TextArea();

	public Panel() {

		ubicarObjetosEnLamina();

		agregarALamina();

		procesaMostrar();

		procesaLimpiar();

	}

	public void procesaLimpiar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				areaTexto.setText("");
			}

		};
		
		botonLimpiar.addActionListener(oyenteDeAccion);
	}

	public void procesaMostrar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {

				asignarValores();

				BotonResultado miPago = new BotonResultado(nombre, horasTrabajadas, tarifa);

				areaTexto.setText(miPago.obtenerResultado());

			}
		};

		botonMostrar.addActionListener(oyenteDeAccion);

	}

	public void asignarValores() {

		this.nombre = campoEmpleado.getText();

		this.horasTrabajadas = Double.parseDouble(campoHoras.getText());

		this.tarifa = Double.parseDouble(campoTarifa.getText());
	}

	public void ubicarObjetosEnLamina() {

		tituloPrincipal.setBounds(120, 10, 160, 20);

		labelEmpleado.setBounds(20, 60, 100, 20);

		campoEmpleado.setBounds(120, 60, 200, 20);

		labelHoras.setBounds(20, 100, 50, 20);

		campoHoras.setBounds(80, 100, 50, 20);

		labelTarifa.setBounds(150, 100, 50, 20);

		campoTarifa.setBounds(200, 100, 50, 20);

		botonMostrar.setBounds(40, 150, 100, 30);

		botonLimpiar.setBounds(200, 150, 100, 30);

		areaTexto.setBounds(30, 200, 300, 100);

	}

	public void agregarALamina() {

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
