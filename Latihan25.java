/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Pengejaan Nama
 */ 

package Pertemuan6;
import java.util.Scanner;

public class Latihan25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan Anda untuk dieja: ");
        String nama = input.nextLine(); 
        /*Penggunaan method scanner nextLine() akan memugkinkan user untuk menginput nama
          secara panjang dan tidak dibatasi oleh jumlah spasi yang dimasukkan.
        */

        System.out.println("\nEjaan untuk \"" + nama + "\" adalah :");
        
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i)); 
        
        /*Variabel i dalam for loop ini akan dianggap oleh program sebagai indeks dari string nama
          Looping for ini akan terus berjalan sampai nilai i lebih kecil dari panjang input nama
          yang dimasukkan oleh user. Panjang dari variabel nama dihitung menggunakan method bawaan Java
          yaitu method length().
          Untuk mencetak huruf sesuai ejaan, maka digunakanlah method charAt() yang akan mengambil 
          karakter dalam string nama sesuai dengan letak index perulangannya. 
        */
}}} 
    


