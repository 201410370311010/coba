
package lab;

public class Hello {
    public static void main (String[] args){
        KelasDua obj = new KelasDua();
        
        obj.setNama("andi");
        obj.setAlamat("Jakarta");
        
        String nama = obj.getNama();
        String alamat = obj.getAlamat();
        System.out.println("Nama: " +nama);
        System.out.println("Alamat: " +alamat);
    }
}