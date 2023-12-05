/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisten;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ailsa
 */
@Entity
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b")
    , @NamedQuery(name = "Buku.findByIdBuku", query = "SELECT b FROM Buku b WHERE b.idBuku = :idBuku")
    , @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku.findBySubjudul", query = "SELECT b FROM Buku b WHERE b.subjudul = :subjudul")
    , @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang")
    , @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit")
    , @NamedQuery(name = "Buku.findByTahun", query = "SELECT b FROM Buku b WHERE b.tahun = :tahun")
    , @NamedQuery(name = "Buku.findByHalaman", query = "SELECT b FROM Buku b WHERE b.halaman = :halaman")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul")
    private String judul;
    @Column(name = "subjudul")
    private String subjudul;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "halaman")
    private String halaman;
    @JoinTable(name = "kategori_buku", joinColumns = {
        @JoinColumn(name = "id_buku", referencedColumnName = "id_buku")}, inverseJoinColumns = {
        @JoinColumn(name = "id_kategori", referencedColumnName = "id_kategori")})
    @ManyToMany
    private Collection<Kategori> kategoriCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buku")
    private Collection<PeminjamanBuku> peminjamanBukuCollection;

    public Buku() {
    }

    public Buku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getHalaman() {
        return halaman;
    }

    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }

    @XmlTransient
    public Collection<Kategori> getKategoriCollection() {
        return kategoriCollection;
    }

    public void setKategoriCollection(Collection<Kategori> kategoriCollection) {
        this.kategoriCollection = kategoriCollection;
    }

    @XmlTransient
    public Collection<PeminjamanBuku> getPeminjamanBukuCollection() {
        return peminjamanBukuCollection;
    }

    public void setPeminjamanBukuCollection(Collection<PeminjamanBuku> peminjamanBukuCollection) {
        this.peminjamanBukuCollection = peminjamanBukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Buku[ idBuku=" + idBuku + " ]";
    }
    
    public String getAllKategori() {
        String kategori = "";
        for (Kategori kat : this.kategoriCollection) {
            if (kategori.isEmpty()) {
                kategori = kat.getKategori();
            } else {
                kategori += ", " + kat.getKategori();
            }
        }
        return kategori;
    }
    
}
