package lab;
public class buku {
	String Judul_Buku;
	String Nama_Penulis;
	int Jumlah_Halaman;
	
	void setJudul_Buku (String J){
		this.Judul_Buku = J;
	}
	String getJudul (){
		return Judul_Buku;
	}
	void setPenulis (String P){
		this.Nama_Penulis = P;
	}
	String getPenulis (){
		return Nama_Penulis;
	}
	void setJumlah_Halaman(int JH){
		this.Jumlah_Halaman = JH;
	}
	int getJumlah_Halaman(){
		return Jumlah_Halaman;
	}
}
