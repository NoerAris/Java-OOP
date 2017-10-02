/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.oop;

import java.util.List;

/**
 *
 * @author Aris
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat list dengan reference/alias keranjang
        List keranjang=new java.util.ArrayList();
        //Menambahkan berbagai macam objek ke dalam List
        keranjang.add("jeruk");
        keranjang.add("apel");
        //Menambahkan objek Integer
        keranjang.add(new Integer(1));
        keranjang.add(new Integer(7));
        //Menambahkan objek Character
        keranjang.add(new Character('a'));
        keranjang.add(new Character('r'));
        //Menambahkan objek String
        keranjang.add(new String("Aris"));
        //Menambahkan objek Double
        keranjang.add(new Double(123.45));
        
        //Menghitung jumlah dari ArrayList
        int jumlahIsiKeranjang=keranjang.size();
        //Menampilkan jumlah isi keranjang
        System.out.println("Jumlah isi List : "+jumlahIsiKeranjang);
        
        //Menampilkan List dengan objek Integer
       for(Object obj:keranjang){
           if(obj instanceof Integer){
               System.out.println("Integer yang diperolah : "+obj);
           }
       }
       //Cek jumlah isi keranjang
        System.out.println("Jumlah isi keranjang : "+keranjang.size());
       //Cek keranjang dengan index 0
        System.out.println("Keranjang dengan index 0 : "+keranjang.get(0));
       //Menghapus List dengan indeks 0       
       keranjang.remove(0);
       //Cek lagi keranjang dengan index 0
        System.out.println("Keranjang dengan index 0 : "+keranjang.get(0));
        //Cek ukuran List keranjang
        System.out.println("Jumlah isi keranjang : "+keranjang.size());
        
        for(Object o:keranjang){
            if(o instanceof String){
                System.out.println(o);
            }
        }
       
    }
    
}
