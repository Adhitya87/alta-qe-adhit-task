public class LuasKelilingPersegiPanjang {
  
    public static void main (String [] args) {
        //input
        int panjang,lebar,luas_persegi_panjang,keliling_persegi_panjang;

        panjang = 7;
        lebar = 8;
        luas_persegi_panjang = panjang * lebar;
        keliling_persegi_panjang = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang : " + luas_persegi_panjang);
        System.out.println("Keliling Persegi Panjang : " + keliling_persegi_panjang);
    }
}