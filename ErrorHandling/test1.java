package ErrorHandling;

/*
TRY   berisi kode normal yang dapat berjalan
CATCH berisi penyimpanan error yang biasa disebut Exception
 */
public class test1 {
        public static void main (String[] args){
            System.out.println("error handling pertama");
            System.out.println("//");

            //pendeklarasian variabel baru
            int a = 10;
            int b = 0;

            try {
                //beberapa operasi matematika sederhana
                int c = a/b;
                int d = a+b;
                int f = b/a;

                System.out.println(c);
                System.out.println(d);
                System.out.println(f);
                //3 perintah di atas tidak akan berhasil dieksekusi karna 1 perintah bernilai salah
            }
            catch (Exception e){ //exception adalah bawaan java
                System.out.println(e); //pengeksekusi nilai error yang disimpan dalam variabel e
                System.out.println("Terjadi error karena setiap int dibagi 0 hasilnya adalah tidak terdefenisi");
                System.out.println("//");

            }
        }
    }



