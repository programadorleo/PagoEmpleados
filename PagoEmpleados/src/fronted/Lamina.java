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

	public JButton getBotonMostrar() {
		return botonMostrar;
	}

	public void setBotonMostrar(JButton botonMostrar) {
		this.botonMostrar = botonMostrar;
	}

	public TextArea getAreaTexto() {
		return areaTexto;
	}

	public void setAreaTexto(String Texto) {
		this.areaTexto.setText(Texto);
	}

	public Lamina() {

		iniciar();

	}

	public void iniciar() {

		ubicarObjetosEnLamina();

		agregarObjetosALamina();

		procesarBotonMostrar();

		procesarBotonLimpiar();

	}

	public void procesarBotonMostrar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {

				ingresarDatosEmpleado();

				ControlPago miPago = new ControlPago(nombre, horasTrabajadas, tarifa);

				setAreaTexto(miPago.obtenerResultado());

			}
		};

		botonMostrar.addActionListener(oyenteDeAccion);

	}

	public void ingresarDatosEmpleado() {

		this.nombre = campoEmpleado.getText();

		if (this.nombre.equals("")) {

			JOptionPane.showMessageDialog(null, "Error el nombre debe ser distinto de vacio");

		}

		try {

			this.horasTrabajadas = Double.parseDouble(campoHoras.getText());

			this.tarifa = Double.parseDouble(campoTarifa.getText());

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Error el valor debe ser un numero");

		}

		if (this.horasTrabajadas < 0) {

			JOptionPane.showMessageDialog(null, "Error el campo Horas debe ser mayor que 0");

			this.nombre = "";
		}

		if (this.tarifa < 0) {

			JOptionPane.showMessageDialog(null, "Error el campo Tarifa debe ser mayor que 0");

			this.nombre = "";
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

}
