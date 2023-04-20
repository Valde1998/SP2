public abstract class ACar implements Car {

    String registrationNumber;
    String make;

    String model;

    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String toString() {
        return "Registration Number: " + getRegistrationNumber() + " Make: " + getMake() + " Model: " + getModel() + " Doors: " + getNumberOfDoors();
    }
}

