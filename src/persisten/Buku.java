/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisten;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    , @NamedQuery(name = "Buku.findByIdbuku", query = "SELECT b FROM Buku b WHERE b.idbuku = :idbuku")
    , @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul")
    , @NamedQuery(name = "Buku.findByKategori", query = "SELECT b FROM Buku b WHERE b.kategori = :kategori")
    , @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang")
    , @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit")
    , @NamedQuery(name = "Buku.findByTahun", query = "SELECT b FROM Buku b WHERE b.tahun = :tahun")
    , @NamedQuery(name = "Buku.findByHalaman", query = "SELECT b FROM Buku b WHERE b.halaman = :halaman")})
public class Buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idbuku")
    private String idbuku;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul")
    private String judul;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "halaman")
    private String halaman;
    @JoinTable(name = "kategori_buku", joinColumns = {
        @JoinColumn(name = "idbuku", referencedColumnName = "idbuku")}, inverseJoinColumns = {
        @JoinColumn(name = "idkategori", referencedColumnName = "idkategori")})
    @ManyToMany
    private Collection<Kategori> kategoriCollection;

    public Buku() {
    }

    public Buku(String idbuku) {
        this.idbuku = idbuku;
    }

    public String getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(String idbuku) {
        this.idbuku = idbuku;
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

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbuku != null ? idbuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.idbuku == null && other.idbuku != null) || (this.idbuku != null && !this.idbuku.equals(other.idbuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Buku[ idbuku=" + idbuku + " ]";
    }
    
}
