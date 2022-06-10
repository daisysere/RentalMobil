package modifier1;
//memanggil class kendaraan yang berada pada package modifier1
import modifier.kendaraan;

//class ini dibuat untuk menggunakan fungsi - fungsi yang ada di class kendaraan
public class PanggilFungsi {

    public static void main(String[] args) {

        kendaraan baru = new kendaraan();  //membuat variabel 'baru' dengan menggunakan
                                            // class kendaraan untuk mengakses setter & getter yang ada di class tersebut
        //cara penggunaaa set
        baru.setJenis_kendaraan("Motor");
        baru.setMerk_kendaraan("Honda");
        baru.setTahun_keluar(2014);

        //proses cetak
        System.out.println("Jenis Kendaraan     =" +baru.getJenis_kendaraan());
        System.out.println("Merk Kendaraan      =" +baru.getMerk_kendaraan());
        System.out.println("Tahun Keluar        =" +baru.getTahun_keluar());
        System.out.println(baru.PanggilInovasi());
    }
}