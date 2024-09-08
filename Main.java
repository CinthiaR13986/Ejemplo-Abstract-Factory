package com.vehiculo.abstractfactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractFactory factory = new CarroGasolinaFactory();
	        
	        // Crear Vehículo y Combustible
	        Vehiculo vehiculo = factory.crearVehiculo();
	        String combustible = factory.crearCombustible();
	        
	        // Mostrar detalles
	        System.out.println("Vehículo creado: " + vehiculo.getDescripcion());
	        System.out.println("Combustible utilizado: " + combustible);
	    }
	
	}


