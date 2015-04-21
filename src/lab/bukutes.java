package lab;
public class bukutes {
	public static void main (String[] args){
		adminbuku[] program;
		program = new adminbuku[5];
		
		program[0] = new adminbuku();
		program[1] = new adminbuku();
		program[2] = new adminbuku();
		program[3] = new adminbuku();
		program[4] = new adminbuku();
		
		for(int i=0;i<program.length;i++){
			program[i].insertdata();
			program[i].cetakdata();
			
		}
	}

}   
