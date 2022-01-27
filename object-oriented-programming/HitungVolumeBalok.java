public class HitungVolume {
    public static void main(String[] args) {
        //input
        int luas_balok,keliling_balok,volume_balok;
        int panjang = 3;
        int lebar = 6;
        int tinggi = 10;
        double luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));;
        double keliling = 4 * (panjang + lebar + tinggi);;
        double volume = panjang * lebar * tinggi;

//       
        System.out.print("Luas Balok  = " + (int)luas + " \nKeliling Balok = "+ (int)keliling
                + " \nVolume Balok = "+ (int)volume);
        System.out.println("");
        }


    }

