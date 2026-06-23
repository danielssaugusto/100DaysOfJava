package org.example.J1_fundamentos.Pratica.vehicle;

// Criei a classe "Vehicle" para criar a estrutura do meu objeto.
public class Vehicle {

    // Esses são os atributos do meu objeto
    // usei os modificadores de acesso "private" para que somente essa classe tenha o poder de modificar os valores com base nas regras criadas pelos Setters.
    private String vehicleName;
    private int mileage;

    // criei um método para exibir os atributos do objeto.
    public void showVehicle(String vehicleName, int vehicleMileage) {
        System.out.println("Veiculo: " + getVehicleName() + " | Quilometragem: " + getMileage());
    }

    // Aqui estão os Getters e Setters para exibir os valores dos atributos e para dar os valores.
    public String getVehicleName() {
        return vehicleName;
    }

    public int getMileage() {
        return mileage;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
