public abstract class AFuelCar extends ACar {

    int kmPrLitre;

    public AFuelCar(int kmPrLitre) {
        this.kmPrLitre = kmPrLitre;
    }
    abstract String getFuelType();

     int  kmPrLitre() {
        return 0;
    }
}
