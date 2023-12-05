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
public class PeminjamanSkripsiPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "no_peminjaman_skripsi")
    private String noPeminjamanSkripsi;
    @Basic(optional = false)
    @Column(name = "id_pengguna")
    private String idPengguna;
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;

    public PeminjamanSkripsiPK() {
    }

    public PeminjamanSkripsiPK(String noPeminjamanSkripsi, String idPengguna, String idSkripsi) {
        this.noPeminjamanSkripsi = noPeminjamanSkripsi;
        this.idPengguna = idPengguna;
        this.idSkripsi = idSkripsi;
    }

    public String getNoPeminjamanSkripsi() {
        return noPeminjamanSkripsi;
    }

    public void setNoPeminjamanSkripsi(String noPeminjamanSkripsi) {
        this.noPeminjamanSkripsi = noPeminjamanSkripsi;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPeminjamanSkripsi != null ? noPeminjamanSkripsi.hashCode() : 0);
        hash += (idPengguna != null ? idPengguna.hashCode() : 0);
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsiPK)) {
            return false;
        }
        PeminjamanSkripsiPK other = (PeminjamanSkripsiPK) object;
        if ((this.noPeminjamanSkripsi == null && other.noPeminjamanSkripsi != null) || (this.noPeminjamanSkripsi != null && !this.noPeminjamanSkripsi.equals(other.noPeminjamanSkripsi))) {
            return false;
        }
        if ((this.idPengguna == null && other.idPengguna != null) || (this.idPengguna != null && !this.idPengguna.equals(other.idPengguna))) {
            return false;
        }
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.PeminjamanSkripsiPK[ noPeminjamanSkripsi=" + noPeminjamanSkripsi + ", idPengguna=" + idPengguna + ", idSkripsi=" + idSkripsi + " ]";
    }
    
}
