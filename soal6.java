public class soal6 {
    public static void main(String[] args){
        double distanceMeter = 5;
        double durationmenit = 10;

        double km = distanceMeter/1000;
        double jam = durationmenit/60;

        double kecepatan = km/jam;
        System.out.println("Kecepatan kendaraan adalah "+ kecepatan+ " km/jam.");
    }
}
