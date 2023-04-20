public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        GasolineCar car1 = new GasolineCar("5P20Y62", "Citroen", "Berlingo", 4, 10);
        GasolineCar car2 = new GasolineCar("003261", "Toyota", "Yaris", 4, 26);
        DieselCar car3 = new DieselCar("957281", "Citroen", "picasso", 4, 6, true);
        DieselCar car4 = new DieselCar("555132", "Kia", "Rio", 4, 35, false);
        ElectricCar car5 = new ElectricCar("635hJY", "Tesla", "Model X", 4, 100, 700);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);
        fleet.addCar(car4);
        fleet.addCar(car5);


        System.out.println(fleet);
        System.out.println(fleet.getTotalRegistrationFeeForFleet());

    }
}
