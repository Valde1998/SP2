public class GasolineCar extends AFuelCar {

    public GasolineCar(int kmPrLitre) {
        super(kmPrLitre);
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }

}
