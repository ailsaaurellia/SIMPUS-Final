/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisten;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ailsa
 */
@Entity
@Table(name = "peminjaman_buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeminjamanBuku.findAll", query = "SELECT p FROM PeminjamanBuku p")
    , @NamedQuery(name = "PeminjamanBuku.findByNoPeminjaman", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.noPeminjaman = :noPeminjaman")
    , @NamedQuery(name = "PeminjamanBuku.findByStatusPeminjaman", query = "SELECT p FROM PeminjamanBuku p WHERE p.statusPeminjaman = :statusPeminjaman")
    , @NamedQuery(name = "PeminjamanBuku.findByIdPengguna", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.idPengguna = :idPengguna")
    , @NamedQuery(name = "PeminjamanBuku.findByAngkatan", query = "SELECT p FROM PeminjamanBuku p WHERE p.angkatan = :angkatan")
    , @NamedQuery(name = "PeminjamanBuku.findByIdBuku", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.idBuku = :idBuku")
    , @NamedQuery(name = "PeminjamanBuku.findByJudulBuku", query = "SELECT p FROM PeminjamanBuku p WHERE p.judulBuku = :judulBuku")
    , @NamedQuery(name = "PeminjamanBuku.findByTanggalPinjam", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalPinjam = :tanggalPinjam")
    , @NamedQuery(name = "PeminjamanBuku.findByTanggalKembali", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalKembali = :tanggalKembali")})
public class PeminjamanBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeminjamanBukuPK peminjamanBukuPK;
    @Column(name = "status_peminjaman")
    private String statusPeminjaman;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "tanggal_pinjam")
    private String tanggalPinjam;
    @Column(name = "tanggal_kembali")
    private String tanggalKembali;
    @JoinColumn(name = "id_buku", referencedColumnName = "id_buku", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Buku buku;
    @JoinColumn(name = "id_pengguna", referencedColumnName = "id_pengguna", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pengguna pengguna;

    public PeminjamanBuku() {
    }

    public PeminjamanBuku(PeminjamanBukuPK peminjamanBukuPK) {
        this.peminjamanBukuPK = peminjamanBukuPK;
    }

    public PeminjamanBuku(String noPeminjaman, String idPengguna, String idBuku) {
        this.peminjamanBukuPK = new PeminjamanBukuPK(noPeminjaman, idPengguna, idBuku);
    }

    public PeminjamanBukuPK getPeminjamanBukuPK() {
        return peminjamanBukuPK;
    }

    public void setPeminjamanBukuPK(PeminjamanBukuPK peminjamanBukuPK) {
        this.peminjamanBukuPK = peminjamanBukuPK;
    }

    public String getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setStatusPeminjaman(String statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public void setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peminjamanBukuPK != null ? peminjamanBukuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanBuku)) {
            return false;
        }
        PeminjamanBuku other = (PeminjamanBuku) object;
        if ((this.peminjamanBukuPK == null && other.peminjamanBukuPK != null) || (this.peminjamanBukuPK != null && !this.peminjamanBukuPK.equals(other.peminjamanBukuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.PeminjamanBuku[ peminjamanBukuPK=" + peminjamanBukuPK + " ]";
    }
    
}
