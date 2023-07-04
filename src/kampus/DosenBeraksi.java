/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kampus;

/**
 *
 * @author User
 */
public class DosenBeraksi {
    public static void main(String[] args){
            
Dosen datadiri = new Dosen("2110010056", "Muhammad Andry R.A", " Teknik Informatika");
       
    System.out.println("Nama    : "+datadiri.getNama());
    System.out.println("Nidn     : "+datadiri.getNidn());
    System.out.println("MataKuliah   : "+datadiri.getMataKuliah());
        
    System.out.println(datadiri.setDetail());
    
}
}