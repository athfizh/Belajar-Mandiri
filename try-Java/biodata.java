import java.util.Scanner;
public class biodata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String Nama = sc.nextLine();

        System.out.print("NIM : ");
        String NIM = sc.nextLine();

        System.out.print("Kelas : ");
        String Kelas = sc.nextLine();

        System.out.print("Prodi : ");
        String Prodi = sc.nextLine();

        System.out.println("Namaku : " + Nama);
        System.out.println("NIMku : " + NIM);
        System.out.println("Kelasku : " + Kelas);
        System.out.println("Prodiku : " + Prodi);

        sc.close();
    }}