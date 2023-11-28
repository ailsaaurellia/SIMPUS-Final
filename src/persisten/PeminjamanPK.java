/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persisten;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Ailsa
 */
@Embeddable
public class PeminjamanPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_petugas")
    private String idPetugas;
    @Basic(optional = false)
    @Column(name = "id_anggota")
    private String idAnggota;
    @Basic(optional = false)
    @Column(name = "no_peminjaman")
    private String noPeminjaman;

    public PeminjamanPK() {
    }

    public PeminjamanPK(String idPetugas, String idAnggota, String noPeminjaman) {
        this.idPetugas = idPetugas;
        this.idAnggota = idAnggota;
        this.noPeminjaman = noPeminjaman;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNoPeminjaman() {
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPetugas != null ? idPetugas.hashCode() : 0);
        hash += (idAnggota != null ? idAnggota.hashCode() : 0);
        hash += (noPeminjaman != null ? noPeminjaman.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanPK)) {
            return false;
        }
        PeminjamanPK other = (PeminjamanPK) object;
        if ((this.idPetugas == null && other.idPetugas != null) || (this.idPetugas != null && !this.idPetugas.equals(other.idPetugas))) {
            return false;
        }
        if ((this.idAnggota == null && other.idAnggota != null) || (this.idAnggota != null && !this.idAnggota.equals(other.idAnggota))) {
            return false;
        }
        if ((this.noPeminjaman == null && other.noPeminjaman != null) || (this.noPeminjaman != null && !this.noPeminjaman.equals(other.noPeminjaman))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.PeminjamanPK[ idPetugas=" + idPetugas + ", idAnggota=" + idAnggota + ", noPeminjaman=" + noPeminjaman + " ]";
    }
    
}
