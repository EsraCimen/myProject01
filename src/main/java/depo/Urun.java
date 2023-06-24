package depo;

public class Urun {
    private int id ;
    private String urunIsmi;
    private String ureticisi;
    private int miktar;
    private String birim;
    private int raf;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        id++;
        this.id = id;
    }


    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticisi() {
        return ureticisi;
    }

    public void setUreticisi(String ureticisi) {
        this.ureticisi = ureticisi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        if(this.miktar <0){
            System.out.println("yeterli stok bulunmamaktadir");
        }else {
            this.miktar=miktar;
        }
    }


    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", ureticisi='" + ureticisi + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf=" + raf +
                '}';
    }

}
