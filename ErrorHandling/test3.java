package ErrorHandling;
/*
TRY   berisi kode normal yang dapat berjalan
CATCH berisi penyimpanan error
 */
public class test3 {
    public static void main(String[] args){
        System.out.println("error handling ketiga");
        System.out.println("//");

        //sebuah array dengan nama hobi yang berisi 6 elemen
        String hobi[] = { "Bersepeda", "Renang", "Bernyanyi", "Menari", "Olahraga", "Sulap", "Dandan" };
                //loop dengan pewarisan
                try {
                    for (int h = 1; h <= 7; h++) {
                        /*
                        inisialisasi -> h = 1
                        kondisi h <= 7, dimana array berjumlah 6, maka dapat disimpulkan ini adalah penyebab error
                        iterasi -> h++
                         */
                        System.out.println(hobi[h]); //perintah untuk menampilkan isi array 1 per 1
                    }
                }
                catch (Exception e) {
                    System.out.println(e);//pengeksekusi nilai error yang disimpan dalam variabel e
                    System.out.println("//");
                }
            }
        }

