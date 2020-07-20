package backend;

import fronted.*;

public class ControlPago {

	private String nombre;
	private double horasTrabajada;
	private double tarifa;
	private double basico;
	private double bonificacion;
	private double neto;

	public ControlPago(String nombre, double horasTrabajadas, double tarifa) {

		this.nombre = nombre;
		this.horasTrabajada = horasTrabajadas;
		this.tarifa = tarifa;
		this.basico = horasTrabajadas * tarifa;
		this.bonificacion = this.basico * 0.2;
		this.neto = (this.basico + this.bonificacion) * 0.9;
	}

	public String obtenerResultado() {

		String resultado;

		if (nombre.equals("")) {

			resultado = "";

		} else {

			resultado = "Resumen de Pago a Empleado: " + this.nombre + "\n\n El salario basico es:" + this.basico
					+ "\n La bonificacion es:" + this.bonificacion + "\n El neto es: " + this.neto;
		}

		return resultado;
	}

}