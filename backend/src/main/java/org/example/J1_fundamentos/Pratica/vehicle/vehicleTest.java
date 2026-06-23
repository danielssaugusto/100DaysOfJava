package org.example.J1_fundamentos.Pratica.vehicle;

public class vehicleTest {
    public static void main(String[] args) {

        // Estou instanciando a classe "Vehicle" e criando um variavel chamada "car".
        // o "new Vehicle();" criará um novo objeto na memória.
        Vehicle car = new Vehicle();

        // Definindo os valores dos atributos da variável "car" através dos setters
        car.setVehicleName("BYD Dolphin");
        car.setMileage(25000);

        String vehicleName = car.getVehicleName();
        int vehicleMileage = car.getMileage();

        car.showVehicle(vehicleName, vehicleMileage);
    }
}
