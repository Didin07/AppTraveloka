import java.util.Scanner;
public class Traveloka {
    public static void main(String[] args) {
        String kode = null;
        String tujuan = null;
        int harga = 150000;
        Scanner input =  new Scanner(System.in);
        tiket user = new tiket ();
        System.out.println("===================================");
        System.out.println("====Pemesanan Tiket Traveloka=====");
        System.out.println("===================================");
        System.out.print("Masukkan Nama : ");
        String nama = input.next();
        System.out.print("Masukkan NIK : ");
        String NIK = input.next();
        System.out.printf("Masukkan NO hp : ");
        String nomorhp = input.next();

        user.setNama(nama);
        user.setNIK(NIK);
        user.setNoHP(nomorhp);

        System.out.println("-------------------------------------");
        System.out.println("==List Akomodasi traveloka==");
        System.out.println("1.Pesawat");
        System.out.println("2.Kereta Api");
        System.out.println("3.Bus");
        System.out.println("4.Travel/Taxi/Mobil");
        System.out.println("5.TUR");
        System.out.printf("Masukkan pilihan anda : ");
        int n = input.nextInt();
        if (n==1){
            kode ="PE01";
        }else if (n==2){
            kode ="KA02";
        } else if (n==3) {
            kode ="B03";
        } else if (n==4) {
            kode ="TX04";
        } else if (n==5) {
            kode ="TUR05";
        }

        System.out.println("-------------------------------------");
        System.out.println("==Pilih tujuan keberangkatan==");
        System.out.println("1.Jakarta");
        System.out.println("2.Bandung");
        System.out.println("3.Yogyakarta");
        System.out.println("4.Malang");
        System.out.println("5.Surabaya");
        System.out.printf("Masukkan pilihan anda : ");
        int i = input.nextInt();
        if ((i == 1)) {
            tujuan ="Jakarta";
        } else if (i==2) {
            tujuan ="Bandung";
        } else if (i==3) {
            tujuan ="Yogyakarta";
        } else if (i==4) {
            tujuan = "Malang";
        } else if (i==5) {
            tujuan ="Surabaya";
        }

        user.setKode(kode);
        user.setTujuan(tujuan);
        user.setHarga(harga);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("======Rincian Pemesanan=====");
        System.out.println("Nama User\t\t : "+ user.getNama());
        System.out.println("NIK\t\t : " +user.getNIK());
        System.out.println("No Hp\t\t : " +user.getNoHP());
        System.out.println("============================");
        System.out.println("No Hp\t\t : " +user.getKode());
        System.out.println("No Hp\t\t : " +user.getTujuan());

    }
}
