import java.util.ArrayList;

public class FleetOfCars {

private ArrayList<Car> fleet;


    public FleetOfCars(){
        fleet = new ArrayList<Car>();
    }

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int total=0;
        for(Car x: fleet) {
            total += x.getRegistrationFee();
        }
        return total;
    }

    public String toString() {
        for(Car x: fleet){
            System.out.print(" "+x);
            System.out.println("\n");
        }

        return "";
    }
}