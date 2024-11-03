/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 25 - Ejaan Nama
 * Deskripsi Program    : Meminta pengguna untuk memasukkan nama depan, 
                          lalu mencetak ejaan nama tersebut. 
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama depan
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.nextLine();

        // Ejaan nama
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
}


