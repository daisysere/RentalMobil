package ErrorHandling;
/*
TRY     berisi kode normal yang dapat berjalan
CATCH   berisi penyimpanan error
FINALLY berisi kode normal yang dapat berjalan namun berada di bawah blok CATCH
 */
public class test2 {
    public static void main(String[] args){
        System.out.println("error handling kedua");
        System.out.println("//");

                try {
                    long data[] = new long[1234567890]; //pengalokasian memori yang tidak tersedia pada sistem.
                }
                catch (Exception e) {
                    System.out.println(e);//pengeksekusi nilai error yang disimpan dalam variabel e
                }
                //contoh blok finally yang berisi kode normal
                finally {

                    int a = 1000;
                    int b = 90;
                    int c = a/b;
                    int d = a*b;
                    System.out.println("Hasil pembagian : " +c);
                    System.out.println("Hasil perkalian : " +d);
                    System.out.println("Block finally akan selalu berhasil dieksekusi walau terjadi error");
                    System.out.println("//");
                }

            }
        }

