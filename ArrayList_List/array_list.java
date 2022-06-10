//ArrayList merupakan operasi yang lebih lengkap dan mudah digunakan dibanding array biasa
//Juga merupakan implementasi dari List
package ArrayList_List;
import java.util.ArrayList;

//nama class tidak boleh 'ArrayList', karna program akan menampilkan error dan penggunaan 'import' akan dianggap useless dan tak terpakai
public class array_list{
    public static void main (String[] args){
        ArrayList<Integer> angka = new ArrayList<Integer>(); //pendeklarasian variabel baru bertipe Integer

        System.out.println("Panjang deret awal: "+angka.size()); // size() adalah fungsi bawaan Java yaitu untuk mencari panjang ArrayLst


        for (int i = 0; i < 20; i++){
             /*
               inisialisasi -> i = 0, maka elemen ke 0 bernilai 0
               kondisi i < 20, i akan mengulang sampai batas lebih kecil dari 20
               iterasi -> i++
             */

            angka.add(i * 2); //pengisian nilai untuk variabel 'angka' yaitu berupa perulangan untuk mengalikan tiap elemen dengan 2
        }

        System.out.println("\nPanjang deret setelah dikalikan dengan 10: "+angka.size());

        for (int i = 0; i < angka.size(); i++){ //perulangan setelah dikalikan dengan 2
            System.out.println("elemen ke - " + i + " : " + angka.get(i));
        }
        }
    }
