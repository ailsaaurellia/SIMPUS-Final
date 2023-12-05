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
@Table(name = "skripsi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s")
    , @NamedQuery(name = "Skripsi.findByIdSkripsi", query = "SELECT s FROM Skripsi s WHERE s.idSkripsi = :idSkripsi")
    , @NamedQuery(name = "Skripsi.findByJudul", query = "SELECT s FROM Skripsi s WHERE s.judul = :judul")
    , @NamedQuery(name = "Skripsi.findByBahasa", query = "SELECT s FROM Skripsi s WHERE s.bahasa = :bahasa")
    , @NamedQuery(name = "Skripsi.findByFakultas", query = "SELECT s FROM Skripsi s WHERE s.fakultas = :fakultas")
    , @NamedQuery(name = "Skripsi.findByProgramStudi", query = "SELECT s FROM Skripsi s WHERE s.programStudi = :programStudi")
    , @NamedQuery(name = "Skripsi.findByTahun", query = "SELECT s FROM Skripsi s WHERE s.tahun = :tahun")
    , @NamedQuery(name = "Skripsi.findByPenulis", query = "SELECT s FROM Skripsi s WHERE s.penulis = :penulis")
    , @NamedQuery(name = "Skripsi.findByPembimbing", query = "SELECT s FROM Skripsi s WHERE s.pembimbing = :pembimbing")
    , @NamedQuery(name = "Skripsi.findByJumlahHalaman", query = "SELECT s FROM Skripsi s WHERE s.jumlahHalaman = :jumlahHalaman")})
public class Skripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;
    @Column(name = "judul")
    private String judul;
    @Column(name = "bahasa")
    private String bahasa;
    @Column(name = "fakultas")
    private String fakultas;
    @Column(name = "program_studi")
    private String programStudi;
    @Column(name = "tahun")
    private String tahun;
    @Column(name = "penulis")
    private String penulis;
    @Column(name = "pembimbing")
    private String pembimbing;
    @Column(name = "jumlah_halaman")
    private String jumlahHalaman;
    @ManyToMany(mappedBy = "skripsiCollection")
    private Collection<Kategori> kategoriCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skripsi")
    private Collection<PeminjamanSkripsi> peminjamanSkripsiCollection;

    public Skripsi() {
    }

    public Skripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPembimbing() {
        return pembimbing;
    }

    public void setPembimbing(String pembimbing) {
        this.pembimbing = pembimbing;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @XmlTransient
    public Collection<Kategori> getKategoriCollection() {
        return kategoriCollection;
    }

    public void setKategoriCollection(Collection<Kategori> kategoriCollection) {
        this.kategoriCollection = kategoriCollection;
    }

    @XmlTransient
    public Collection<PeminjamanSkripsi> getPeminjamanSkripsiCollection() {
        return peminjamanSkripsiCollection;
    }

    public void setPeminjamanSkripsiCollection(Collection<PeminjamanSkripsi> peminjamanSkripsiCollection) {
        this.peminjamanSkripsiCollection = peminjamanSkripsiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Skripsi[ idSkripsi=" + idSkripsi + " ]";
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
