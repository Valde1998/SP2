public class ElectricCar extends ACar {

    private int batteryCapacityWh;
    private int maxRangeKm;
    private int registrationFee;
    private float whPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityWh = batteryCapacity;
        this.maxRangeKm = maxRange;
        this.whPrKm = maxRangeKm / batteryCapacityWh;
    }

    public int getBatteryCapacityKWh() {
        return this.batteryCapacityWh;
    }

    public int getMaxRangeKm() {
        return this.maxRangeKm;
    }

    public int getWhPrKm() {
        int result = (int) (whPrKm / 91.25 * 100);
        return result;
    }

    @Override
    public int getRegistrationFee() {
        if (getWhPrKm() >= 20 && getWhPrKm() <= 50) {
            this.registrationFee = 330;
        } else if (getWhPrKm() >= 15 && getWhPrKm() < 20) {
            this.registrationFee = 1050;
        } else if (getWhPrKm() >= 10 && getWhPrKm() < 15) {
            this.registrationFee = 2340;
        } else if (getWhPrKm() >= 5 && getWhPrKm() < 10) {
            this.registrationFee = 5500;
        } else if (getWhPrKm() < 5) {
            this.registrationFee = 10470;
        } else {
            this.registrationFee = 0;
        }
        return registrationFee;

    }




    @Override
    public String toString() {
        return "ElectricCar: " + " Registration Number: " + getRegistrationNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Doors: " + getNumberOfDoors() + ", WhPrKm: " + getWhPrKm()  + ", registrationFee: " + getRegistrationFee();
    }
}


