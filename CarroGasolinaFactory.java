package com.vehiculo.abstractfactory;

public class CarroGasolinaFactory implements AbstractFactory {

	@Override
    public Vehiculo crearVehiculo() {
        return new Carro(); 
    }

    @Override
    public String crearCombustible() {
        return "Gasolina";
    }

    private class Carro implements Vehiculo {
        @Override
        public String getDescripcion() {
            return "Carro";
        }

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return null;
		}
    }
}