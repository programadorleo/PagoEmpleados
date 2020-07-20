/*package fronted;

import backend.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Panel {

	private String nombre;

	private double horasTrabajadas = 0;

	private double tarifa = 0;
	
	

	public Panel() {
	                      	
		procesarBotonMostrar();

		procesarBotonLimpiar();
	
	}

	public void procesarBotonMostrar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {

				ingresarDatosEmpleado();

				ControlPago miPago = new ControlPago(nombre, horasTrabajadas, tarifa);

		//	miLamina.setAreaTexto(miPago.obtenerResultado()); 
			
			.setAreaTexto(miPago.obtenerResultado());   

			}
		};

		 				
		 JButton botonMostrar =  miLamina.getBotonMostrar();

		 botonMostrar.addActionListener(oyenteDeAccion);
		 
		 miLamina.setBotonMostrar(botonMostrar);
	}

	public void ingresarDatosEmpleado() {

		//this.nombre = campoEmpleado.getText();
		
		this.nombre = miLamina.campoEmpleado.getText();
		

		if (this.nombre.equals("")) {

			JOptionPane.showMessageDialog(null, "Error el nombre debe ser distinto de vacio");

		}

		try {

			//this.horasTrabajadas = Double.parseDouble(campoHoras.getText());

			this.horasTrabajadas = Double.parseDouble(miLamina.campoHoras.getText());
			
			//this.tarifa = Double.parseDouble(campoTarifa.getText());
			
			this.tarifa = Double.parseDouble(miLamina.campoTarifa.getText());

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Error el valor debe ser un numero");

		}

		if (this.horasTrabajadas < 0) {

			JOptionPane.showMessageDialog(null, "Error el campo Horas debe ser mayor que 0");

			this.nombre="";
		}
		
		if (this.tarifa < 0 ) {

			JOptionPane.showMessageDialog(null, "Error el campo Tarifa debe ser mayor que 0");

			this.nombre="";
		}
	}
	

	public void procesarBotonLimpiar() {

		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				limpiarCampos();
			}

		};

		//botonLimpiar.addActionListener(oyenteDeAccion);
		
		miLamina.botonLimpiar.addActionListener(oyenteDeAccion);
		
	}
	

			
	
}*/
