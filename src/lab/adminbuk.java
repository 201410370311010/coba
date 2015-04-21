package lab;
import java.util.Scanner;
public class adminbuk {
    buk b1 = new buk();
	Scanner kata = new Scanner(System.in);
	public void insertDataBuku(){
		Scanner iDB = new Scanner(System.in);
		
		System.out.println("Judul Buku : ");
		String jBuku = iDB.next();
		b1.setJudul(jBuku);
		
		System.out.println("Penulis : ");
		String pBuku = iDB.next();
		b1.setPenulis(pBuku);
		
		System.out.println("Jumlah Halaman : ");
		int jHal = iDB.nextInt();
		b1.setJumlahHalaman(jHal);
		
	}
		
	public void cetakDataBuku(){
		System.out.println("Judul Buku : "+b1.getJudul());
		System.out.println("Penulis : "+b1.getPenulis());
		System.out.println("Jumlah Halaman : "+b1.getJumlahHalaman());
	}
	public void operasiString(){
		System.out.println("EQUALS");
		String [] kata1 = new String[20];
		String [] kata2 = new String[20];
		
		System.out.println("masukakan kata pertama : ");
		kata1[0] = kata.nextLine();
		System.out.println("masukkan kata kedua : ");
		kata2[0] = kata.nextLine();
		if (kata1[0].equals(kata2[0])){
			System.out.println("kata 1 dan 2 memiliki isi yang sama");
		}
		else{
			System.out.println("kata 1 dan 2 tidak mamiliki isi yang sama");
		}
		
		System.out.println("\nTRIM");
		String [] potong = new String [20];
		System.out.println("masukkan kata : ");
		potong [0] = kata.nextLine();
		System.out.println("hasilnya : "+potong[0].trim());
		
		System.out.println("\noperasi UPPERCASE");
		String[] besar = new String[20];
		System.out.println("Masukkan kata : ");
		besar [0] = kata.nextLine();
		System.out.println("hasilnya : "+besar[0].toUpperCase());
		
		System.out.println("\nLOWERCASE");
		String[] kecil = new String[20];
		System.out.println("Masukkan kata : ");
		kecil [0] = kata.nextLine();
		System.out.println("hasilnya : "+kecil[0].toLowerCase());
		
		System.out.println("REPLACE ");
		String asli = "ahmad dhani";
		String ganti = asli.replace('a','o');
		System.out.println("Awal : "+asli);
		System.out.println("Setelah diganti : "+ganti);
	}
	public void cariBuku(){
		String[] cari = new String [20];
		System.out.println("masukkkan kata kunci : ");
		cari[0]  = kata.nextLine();
		System.out.println("hasil penelusuran : "+kata);
	}
        
}
 