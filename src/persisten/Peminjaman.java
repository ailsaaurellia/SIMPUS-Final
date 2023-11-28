/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisten;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ailsa
 */
@Entity
@Table(name = "peminjaman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peminjaman.findAll", query = "SELECT p FROM Peminjaman p")
    , @NamedQuery(name = "Peminjaman.findByIdPetugas", query = "SELECT p FROM Peminjaman p WHERE p.peminjamanPK.idPetugas = :idPetugas")
    , @NamedQuery(name = "Peminjaman.findByIdAnggota", query = "SELECT p FROM Peminjaman p WHERE p.peminjamanPK.idAnggota = :idAnggota")
    , @NamedQuery(name = "Peminjaman.findByNoPeminjaman", query = "SELECT p FROM Peminjaman p WHERE p.peminjamanPK.noPeminjaman = :noPeminjaman")
    , @NamedQuery(name = "Peminjaman.findByTanggalPinjam", query = "SELECT p FROM Peminjaman p WHERE p.tanggalPinjam = :tanggalPinjam")
    , @NamedQuery(name = "Peminjaman.findByTanggalKembali", query = "SELECT p FROM Peminjaman p WHERE p.tanggalKembali = :tanggalKembali")
    , @NamedQuery(name = "Peminjaman.findByKeterangan", query = "SELECT p FROM Peminjaman p WHERE p.keterangan = :keterangan")
    , @NamedQuery(name = "Peminjaman.findByStatus", query = "SELECT p FROM Peminjaman p WHERE p.status = :status")})
public class Peminjaman implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeminjamanPK peminjamanPK;
    @Column(name = "tanggal_pinjam")
    @Temporal(TemporalType.DATE)
    private Date tanggalPinjam;
    @Column(name = "tanggal_kembali")
    @Temporal(TemporalType.DATE)
    private Date tanggalKembali;
    @Column(name = "keterangan")
    private String keterangan;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_anggota", referencedColumnName = "id_anggota", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Anggota anggota;
    @JoinColumn(name = "id_petugas", referencedColumnName = "id_petugas", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Petugas petugas;

    public Peminjaman() {
    }

    public Peminjaman(PeminjamanPK peminjamanPK) {
        this.peminjamanPK = peminjamanPK;
    }

    public Peminjaman(String idPetugas, String idAnggota, String noPeminjaman) {
        this.peminjamanPK = new PeminjamanPK(idPetugas, idAnggota, noPeminjaman);
    }

    public PeminjamanPK getPeminjamanPK() {
        return peminjamanPK;
    }

    public void setPeminjamanPK(PeminjamanPK peminjamanPK) {
        this.peminjamanPK = peminjamanPK;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peminjamanPK != null ? peminjamanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peminjaman)) {
            return false;
        }
        Peminjaman other = (Peminjaman) object;
        if ((this.peminjamanPK == null && other.peminjamanPK != null) || (this.peminjamanPK != null && !this.peminjamanPK.equals(other.peminjamanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Peminjaman[ peminjamanPK=" + peminjamanPK + " ]";
    }
    
}
