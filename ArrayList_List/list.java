//
package ArrayList_List;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args){
        List<String> list_pekerjaan = new ArrayList<String>(); //type antar sisi kiri dan kanan harus sama
        //constructor untuk daftar array
        list_pekerjaan.add("Menyapu dan Mengepel");
        list_pekerjaan.add("Menyuci Pakaian");
        list_pekerjaan.add("Memasak");
        list_pekerjaan.add("Membersihkan Kamar");

        //untuk setiap constructor beralih menjadi 1 koleksi yang bernama 'tiap_list'
        for (String tiap_list : list_pekerjaan){
            System.out.println(tiap_list);
        }
        System.out.println();

        //untuk mengulang seluruh list_pekerjaan sebanyak i
        for(int i = 0; i < list_pekerjaan.size(); i++){
            System.out.println(list_pekerjaan.get(i));
        }

    }
}
