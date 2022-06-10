package modifier;

public class kendaraan {
    private String jenis_kendaraan;
    private String merk_kendaraan;
    private int tahun_keluar;
//di atas adalah pendeklarasian variabel dengan semua akses private


    //setter & getter
    /*
    Method setter dan getter harus diberikan modifier public, karena method ini akan diakses dari luar class.
    Method          Perbedaan                                       Tujuan
    setter          tidak memiliki nilai kembalian void (kosong)    hanya untuk mengisi data ke dalam atribut
    getter          memiliki nilai kembalian sesuai tipe data       untuk mengambil nilai
     */

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getMerk_kendaraan() {
        return merk_kendaraan;
    }

    public void setMerk_kendaraan(String merk_kendaraan) {
        this.merk_kendaraan = merk_kendaraan;
    }

    public int getTahun_keluar() {
        return tahun_keluar;
    }

    public void setTahun_keluar(int tahun_keluar) {
        this.tahun_keluar = tahun_keluar;
    }

    //method private bernama Inovasi_baru
    private String Inovasi_baru(){
        String k = "Segera lengkapi surat - surat berkendara anda";
        return k;
    }

    //method public untuk mengakses method Inovasi_baru();
    public String PanggilInovasi(){
        return Inovasi_baru();
    }

}