package backend;

import fronted.*;

public class BotonResultado {
	
	String nombre;
	double horasTrabajada;
	double tarifa;
	double basico; 
	double bonificacion;
	double neto;

	public BotonResultado(String nombre, double horasTrabajadas, double tarifa) {
		
		this.nombre=nombre;
		this.horasTrabajada=horasTrabajadas;
		this.tarifa=tarifa;
		this.basico=horasTrabajadas*tarifa;
		this.bonificacion=this.basico*0.2;
		this.neto=(this.basico+this.bonificacion)*0.9; 
	}

	public String obtenerResultado() {
				
		String resultado = "Resumen de Pago a Empleado: "+this.nombre+
				             "\n\n El salario basico es:"+this.basico+
				             "\n La bonificacion es:"+this.bonificacion+
				             "\nEl neto es: "+this.neto; 	
		
		return resultado;
	}
	
}