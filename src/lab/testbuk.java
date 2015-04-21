package lab;
import java.util.*;
public class testbuk {
	public static void main(String[] zaky){
		adminbuk test = new adminbuk();
		Scanner in = new Scanner(System.in);
		System.out.println("Masukan jumlah yang diinginkan : ");
		int a = in.nextInt();
		adminbuk [] dan = new adminbuk[a];		
		for(int i=0; i<dan.length; i++){
			dan[i] = new adminbuk();
			dan[i].insertDataBuku();
			dan[i].cetakDataBuku();
			
		}
		dan[0].cariBuku();
		test.operasiString();
		
	}	
}