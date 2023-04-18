public class DieselCar extends  AFuelCar{

    boolean hasParticleFilter;
    public DieselCar(int kmPrLitre) {
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
    public int hasParticleFilter(){
       return 0;
    }
}
