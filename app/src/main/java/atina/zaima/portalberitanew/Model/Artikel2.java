package atina.zaima.portalberitanew.Model;

public class Artikel2 {
    String id, judul, berita,gambar,kategori;

    public Artikel2(String id, String judul, String berita, String gambar, String kategori) {
        this.id = id;
        this.judul = judul;
        this.berita = berita;
        this.gambar = gambar;
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getBerita() {
        return berita;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }
}
