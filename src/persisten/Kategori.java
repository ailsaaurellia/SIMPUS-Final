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
@Table(name = "kategori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kategori.findAll", query = "SELECT k FROM Kategori k")
    , @NamedQuery(name = "Kategori.findByIdkategori", query = "SELECT k FROM Kategori k WHERE k.idkategori = :idkategori")
    , @NamedQuery(name = "Kategori.findByKategori", query = "SELECT k FROM Kategori k WHERE k.kategori = :kategori")})
public class Kategori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idkategori")
    private String idkategori;
    @Column(name = "kategori")
    private String kategori;
    @ManyToMany(mappedBy = "kategoriCollection")
    private Collection<Buku> bukuCollection;

    public Kategori() {
    }

    public Kategori(String idkategori) {
        this.idkategori = idkategori;
    }

    public String getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(String idkategori) {
        this.idkategori = idkategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @XmlTransient
    public Collection<Buku> getBukuCollection() {
        return bukuCollection;
    }

    public void setBukuCollection(Collection<Buku> bukuCollection) {
        this.bukuCollection = bukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkategori != null ? idkategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategori)) {
            return false;
        }
        Kategori other = (Kategori) object;
        if ((this.idkategori == null && other.idkategori != null) || (this.idkategori != null && !this.idkategori.equals(other.idkategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Kategori[ idkategori=" + idkategori + " ]";
    }
    
}
