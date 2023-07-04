
package kampus;


public class Dosen {
     private String nidn;
  private String nama;
  private String matakuliah;
    private String Nidn;
    private String MataKuliah;
  
  public Dosen (String nidn, String nama, String matakuliah) {
        this.nidn= nidn;
        this.nama = nama;
        this.matakuliah = matakuliah;
}
    public String setDetail(){
         String matakuiah = null;
        return nidn + nama + matakuiah;
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
         String MataKuliah = null;
        return MataKuliah;
    }
    
    public void setMataKuliah(String MataKuliah) {
        this.MataKuliah = MataKuliah;
    }
}