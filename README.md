# PagoEmpleados
## se emplea swing 
## Programa que se le ingresa: 
#### Nombre = Patricio
#### Horas = 10
#### Tarifa = 20
 
 ## Muestra 
        Resumen de pago a empleado Patricio
        
        El salario basico es: 200  se calcula Horas*Tarifa
        La bonificacion: 40         se calcula basico *0.2   (20%)
        El neto es: 216             se (calcula basico+bonificacion)*0.9  (90%)
                          
### El programa esta compuesto de 4 clases divididas
### en dos paquetes fronted y backend
## En el fronted se encuentra
### Main : Es la encargada de instanciar Ventana y hacerla visible
### Ventana: Ubica la ventana en pantalla y le da un ancho y largo, instancia Lamina y se la agrega a ventana
### Lamina: crea y ubica los campos y botones y se encarga de que los datos ingresados sean los correctos
## En el backend se encuentra:
### ControlPago: recibe nombre, horas, tarifa, realiza los calculos y los devuelve en un string 


