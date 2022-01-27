public class HitungVolumeTabung {
    public static void main(String[] args) {
        //input
        int r=7;
        int t=10;
        double PHI = 3.14;
        double luas, volume;




        luas = 2 * (PHI * r * r) + (2 * PHI * r * t);
        volume = (PHI * r * r) * t;

        System.out.println("Luas Tabung : " + luas);
//        System.out.println("Keliling Balok : " + keliling);
        System.out.println("Volume Tabung : " + volume);


    }
}
