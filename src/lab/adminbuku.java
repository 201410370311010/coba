package lab;
import java.util.Scanner;
public class adminbuku {

	buku isi = new buku();
	Scanner input;
	public void insertdata(){
		input = new Scanner (System.in);
		
		System.out.println("Judul Buku : ");
		isi.setJudul_Buku(input.next());
		System.out.println("Penulis Buku : ");
		isi.setPenulis(input.next());
		System.out.println("Jumlah Halaman : ");
		isi.setJumlah_Halaman(input.nextInt());
	}
	public void cetakdata(){
		System.out.println("Judul Buku : "+isi.getJudul());
		System.out.println("Penulis Buku : "+isi.getPenulis());
		System.out.println("Jumlah Halaman : "+isi.getJumlah_Halaman());
	}
}