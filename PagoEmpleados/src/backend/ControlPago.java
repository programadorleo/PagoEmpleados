package backend;

public class ControlPago {

	private String nombre;
	private double horasTrabajadas;
	private double tarifa;
	private double basico;
	private double bonificacion;
	private double neto;

	public ControlPago(String nombre, double horasTrabajadas, double tarifa) {

		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifa = tarifa;
		this.basico = horasTrabajadas * tarifa;
		this.bonificacion = this.basico * 0.2;
		this.neto = (this.basico + this.bonificacion) * 0.9;
	}

	public String obtenerResultado() {

		String resultado;

		if (nombre.equals("")||horasTrabajadas<=0||tarifa<=0) {
         
			resultado = "";

		} else {

			resultado = "Resumen de Pago a Empleado: " + nombre + "\n\n El salario basico es:" + basico
					+ "\n La bonificacion es:" + bonificacion + "\n El neto es: " + neto;
		}

		return resultado;
	}

}