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
public class PeminjamanBukuPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "no_peminjaman")
    private String noPeminjaman;
    @Basic(optional = false)
    @Column(name = "id_pengguna")
    private String idPengguna;
    @Basic(optional = false)
    @Column(name = "id_buku")
    private String idBuku;

    public PeminjamanBukuPK() {
    }

    public PeminjamanBukuPK(String noPeminjaman, String idPengguna, String idBuku) {
        this.noPeminjaman = noPeminjaman;
        this.idPengguna = idPengguna;
        this.idBuku = idBuku;
    }

    public String getNoPeminjaman() {
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPeminjaman != null ? noPeminjaman.hashCode() : 0);
        hash += (idPengguna != null ? idPengguna.hashCode() : 0);
        hash += (idBuku != null ? idBuku.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanBukuPK)) {
            return false;
        }
        PeminjamanBukuPK other = (PeminjamanBukuPK) object;
        if ((this.noPeminjaman == null && other.noPeminjaman != null) || (this.noPeminjaman != null && !this.noPeminjaman.equals(other.noPeminjaman))) {
            return false;
        }
        if ((this.idPengguna == null && other.idPengguna != null) || (this.idPengguna != null && !this.idPengguna.equals(other.idPengguna))) {
            return false;
        }
        if ((this.idBuku == null && other.idBuku != null) || (this.idBuku != null && !this.idBuku.equals(other.idBuku))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.PeminjamanBukuPK[ noPeminjaman=" + noPeminjaman + ", idPengguna=" + idPengguna + ", idBuku=" + idBuku + " ]";
    }
    
}
