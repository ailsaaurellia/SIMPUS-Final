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
@Table(name = "peminjaman_skripsi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeminjamanSkripsi.findAll", query = "SELECT p FROM PeminjamanSkripsi p")
    , @NamedQuery(name = "PeminjamanSkripsi.findByNoPeminjamanSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.noPeminjamanSkripsi = :noPeminjamanSkripsi")
    , @NamedQuery(name = "PeminjamanSkripsi.findByJudulSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.judulSkripsi = :judulSkripsi")
    , @NamedQuery(name = "PeminjamanSkripsi.findByStatusPeminjaman", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.statusPeminjaman = :statusPeminjaman")
    , @NamedQuery(name = "PeminjamanSkripsi.findByTglPeminjamanSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tglPeminjamanSkripsi = :tglPeminjamanSkripsi")
    , @NamedQuery(name = "PeminjamanSkripsi.findByTglKembaliSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tglKembaliSkripsi = :tglKembaliSkripsi")
    , @NamedQuery(name = "PeminjamanSkripsi.findByIdPengguna", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.idPengguna = :idPengguna")
    , @NamedQuery(name = "PeminjamanSkripsi.findByAngkatan", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.angkatan = :angkatan")
    , @NamedQuery(name = "PeminjamanSkripsi.findByIdSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.idSkripsi = :idSkripsi")})
public class PeminjamanSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeminjamanSkripsiPK peminjamanSkripsiPK;
    @Column(name = "judul_skripsi")
    private String judulSkripsi;
    @Column(name = "status_peminjaman")
    private String statusPeminjaman;
    @Column(name = "tgl_peminjaman_skripsi")
    @Temporal(TemporalType.DATE)
    private Date tglPeminjamanSkripsi;
    @Column(name = "tgl_kembali_skripsi")
    @Temporal(TemporalType.DATE)
    private Date tglKembaliSkripsi;
    @Column(name = "angkatan")
    private String angkatan;
    @JoinColumn(name = "id_pengguna", referencedColumnName = "id_pengguna", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pengguna pengguna;
    @JoinColumn(name = "id_skripsi", referencedColumnName = "id_skripsi", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Skripsi skripsi;

    public PeminjamanSkripsi() {
    }

    public PeminjamanSkripsi(PeminjamanSkripsiPK peminjamanSkripsiPK) {
        this.peminjamanSkripsiPK = peminjamanSkripsiPK;
    }

    public PeminjamanSkripsi(String noPeminjamanSkripsi, String idPengguna, String idSkripsi) {
        this.peminjamanSkripsiPK = new PeminjamanSkripsiPK(noPeminjamanSkripsi, idPengguna, idSkripsi);
    }

    public PeminjamanSkripsiPK getPeminjamanSkripsiPK() {
        return peminjamanSkripsiPK;
    }

    public void setPeminjamanSkripsiPK(PeminjamanSkripsiPK peminjamanSkripsiPK) {
        this.peminjamanSkripsiPK = peminjamanSkripsiPK;
    }

    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    public String getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setStatusPeminjaman(String statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }

    public Date getTglPeminjamanSkripsi() {
        return tglPeminjamanSkripsi;
    }

    public void setTglPeminjamanSkripsi(Date tglPeminjamanSkripsi) {
        this.tglPeminjamanSkripsi = tglPeminjamanSkripsi;
    }

    public Date getTglKembaliSkripsi() {
        return tglKembaliSkripsi;
    }

    public void setTglKembaliSkripsi(Date tglKembaliSkripsi) {
        this.tglKembaliSkripsi = tglKembaliSkripsi;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public void setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
    }

    public Skripsi getSkripsi() {
        return skripsi;
    }

    public void setSkripsi(Skripsi skripsi) {
        this.skripsi = skripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peminjamanSkripsiPK != null ? peminjamanSkripsiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsi)) {
            return false;
        }
        PeminjamanSkripsi other = (PeminjamanSkripsi) object;
        if ((this.peminjamanSkripsiPK == null && other.peminjamanSkripsiPK != null) || (this.peminjamanSkripsiPK != null && !this.peminjamanSkripsiPK.equals(other.peminjamanSkripsiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.PeminjamanSkripsi[ peminjamanSkripsiPK=" + peminjamanSkripsiPK + " ]";
    }
    
}
