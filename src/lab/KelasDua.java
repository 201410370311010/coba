/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author asus cb46c
 */
public class KelasDua {
    String nama;
    String alamat;
    
    
    KelasDua(){
        System.out.println("ini konstraktor");
    }
    
    void setNama ( String n){
        this.nama = n;
    }
    String getNama(){
        return nama;
    }
    void setAlamat (String a){
        this.alamat = a;
    }
    String getAlamat(){
        return alamat;
    }
}

