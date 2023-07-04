
package kampus;


public class Dosen {
     private String nidn;
  private String nama;
  private String mataKuliah;
  
  public Mahasiswa(String nidn, String nama, String mataKuliah) {
        this.nidn= nidn;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
}
    public String setDetail(){
        return nidn + nama + mataKuiah;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String Nidn) {
        this.Nidn = Nidn;
    }
    
    public String getNama() {
        return nama;
    }
      public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getMataKuliah() {
        return MataKuliah;
    }
    
    public void setMataKuliah(String MataKuliah) {
        this.MataKuliah = MataKuliah;
    }
}