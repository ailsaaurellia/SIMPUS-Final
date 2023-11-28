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
@Table(name = "anggota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anggota.findAll", query = "SELECT a FROM Anggota a")
    , @NamedQuery(name = "Anggota.findByIdAnggota", query = "SELECT a FROM Anggota a WHERE a.idAnggota = :idAnggota")
    , @NamedQuery(name = "Anggota.findByNama", query = "SELECT a FROM Anggota a WHERE a.nama = :nama")
    , @NamedQuery(name = "Anggota.findByNim", query = "SELECT a FROM Anggota a WHERE a.nim = :nim")
    , @NamedQuery(name = "Anggota.findByFakultas", query = "SELECT a FROM Anggota a WHERE a.fakultas = :fakultas")
    , @NamedQuery(name = "Anggota.findByProgramStudi", query = "SELECT a FROM Anggota a WHERE a.programStudi = :programStudi")
    , @NamedQuery(name = "Anggota.findByAngkatan", query = "SELECT a FROM Anggota a WHERE a.angkatan = :angkatan")
    , @NamedQuery(name = "Anggota.findByAlamat", query = "SELECT a FROM Anggota a WHERE a.alamat = :alamat")
    , @NamedQuery(name = "Anggota.findByTelephone", query = "SELECT a FROM Anggota a WHERE a.telephone = :telephone")
    , @NamedQuery(name = "Anggota.findByEmail", query = "SELECT a FROM Anggota a WHERE a.email = :email")
    , @NamedQuery(name = "Anggota.findByJenisKelamin", query = "SELECT a FROM Anggota a WHERE a.jenisKelamin = :jenisKelamin")})
public class Anggota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_anggota")
    private String idAnggota;
    @Column(name = "nama")
    private String nama;
    @Column(name = "nim")
    private String nim;
    @Column(name = "fakultas")
    private String fakultas;
    @Column(name = "program_studi")
    private String programStudi;
    @Column(name = "angkatan")
    private String angkatan;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anggota")
    private Collection<Peminjaman> peminjamanCollection;

    public Anggota() {
    }

    public Anggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
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

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @XmlTransient
    public Collection<Peminjaman> getPeminjamanCollection() {
        return peminjamanCollection;
    }

    public void setPeminjamanCollection(Collection<Peminjaman> peminjamanCollection) {
        this.peminjamanCollection = peminjamanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnggota != null ? idAnggota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anggota)) {
            return false;
        }
        Anggota other = (Anggota) object;
        if ((this.idAnggota == null && other.idAnggota != null) || (this.idAnggota != null && !this.idAnggota.equals(other.idAnggota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Anggota[ idAnggota=" + idAnggota + " ]";
    }
    
}
