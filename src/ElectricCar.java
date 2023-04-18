public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRange;

    public ElectricCar(int batteryCapacity, int maxRange){
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return 0;
    }

   public int getMaxRangeKm() {
        return 0;
    }

   public int getWhPrKm() {
        return 0;
   }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
