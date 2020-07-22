package fronted;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import backend.ControlPago;

public class Lamina extends JPanel {

	private String nombre;
	private double horasTrabajadas = 0;
	private double tarifa = 0;

	private JLabel tituloPrincipal = new JLabel("PAGO DE EMPLEADOS");
	private JLabel labelEmpleado = new JLabel("EMPLEADO");
	private JTextField campoEmpleado = new JTextField(30);
	private JLabel labelHoras = new JLabel("HORAS");
	private JTextField campoHoras = new JTextField(5);
	private JLabel labelTarifa = new JLabel("TARIFA");
	private JTextField campoTarifa = new JTextField(5);
	private JButton botonMostrar = new JButton("MOSTRAR");
	private JButton botonLimpiar = new JButton("LIMPIAR");
	private TextArea areaTexto = new TextArea();

	public Lamina() {
		
		posicionarObjetosEnLamina();
		agregarObjetosALamina();

	}

	public void iniciar() {
	
		procesarBotonMostrar();
		procesarBotonLimpiar();

	}

	public void posicionarObjetosEnLamina() {

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

	public void agregarObjetosALamina() {

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

	public void procesarBotonMostrar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {

				ingresarDatosEmpleado();

				ControlPago miPago = new ControlPago(nombre, horasTrabajadas, tarifa);

				areaTexto.setText(miPago.obtenerResultado());

			}
		};

		botonMostrar.addActionListener(oyenteDeAccion);

	}

	public void ingresarDatosEmpleado() {

		nombre = campoEmpleado.getText();

		if (nombre.equals("")) {

			JOptionPane.showMessageDialog(null, "Error el nombre debe ser distinto de vacio");

		}

		try {

			horasTrabajadas = Double.parseDouble(campoHoras.getText());

			tarifa = Double.parseDouble(campoTarifa.getText());

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Error el valor debe ser un numero");

		}

		menorCero(horasTrabajadas, "Error el campo Horas debe ser mayor que 0");
		menorCero(tarifa, "Error el campo Tarifa debe ser mayor que 0");

	}

	public void menorCero(double valor, String mensajeError) {

		if (valor <= 0) {

			JOptionPane.showMessageDialog(null, mensajeError);
		}
	}

	public void procesarBotonLimpiar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				limpiarCampos();
			}

		};

		botonLimpiar.addActionListener(oyenteDeAccion);

	}

	public void limpiarCampos() {

		campoEmpleado.setText("");
		campoHoras.setText("");
		campoTarifa.setText("");
		areaTexto.setText("");

	}

}
