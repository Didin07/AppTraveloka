public class tiket extends user {
    private String kode;
    private int harga;
    private String tujuan;
    public String getKode() {
        return this.kode;
    }

    public void setKode(String kd) {
        this.kode = kd;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tj) {
        this.tujuan = tj;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int hg) {
        this.harga = hg;
    }
}
