import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        mobil mbl = new mobil();

        System.out.println("Selamat Datang Di Showroom");
        System.out.println("Merk Mobil");
        System.out.println("1.Agya");
        System.out.println("2.Innova");
        System.out.println("3.Avanza");
        System.out.println("4.Pajero Sport");
        System.out.println("5.Xenia");
        System.out.println("6.Fortuner");
        System.out.println("Masukkan Pilihan Anda : ");
        mbl.setKode(br.readLine());

        System.out.println("Merk Mobil : " + mbl.getMerk());
        System.out.println("Harga : " + mbl.getHarga());
        System.out.println("");

        System.out.println("Masukkan Jumlah :");
        mbl.jumlah=Integer.parseInt(br.readLine());
        System.out.println("");

        System.out.println("Total : " + mbl.getTotal());
        System.out.println("Diskon : " + mbl.getDiskon());
        System.out.println("Total Bayar = " + mbl.getTotalBayar());
        System.out.println("TerimaKasih Sudah Berbelanja DiShowroom Kami");
    }

}
