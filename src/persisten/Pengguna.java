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
@Table(name = "pengguna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pengguna.findAll", query = "SELECT p FROM Pengguna p")
    , @NamedQuery(name = "Pengguna.findByIdPengguna", query = "SELECT p FROM Pengguna p WHERE p.idPengguna = :idPengguna")
    , @NamedQuery(name = "Pengguna.findByNim", query = "SELECT p FROM Pengguna p WHERE p.nim = :nim")
    , @NamedQuery(name = "Pengguna.findByNama", query = "SELECT p FROM Pengguna p WHERE p.nama = :nama")
    , @NamedQuery(name = "Pengguna.findByJurusan", query = "SELECT p FROM Pengguna p WHERE p.jurusan = :jurusan")
    , @NamedQuery(name = "Pengguna.findByTempatLahir", query = "SELECT p FROM Pengguna p WHERE p.tempatLahir = :tempatLahir")
    , @NamedQuery(name = "Pengguna.findByTanggalLahir", query = "SELECT p FROM Pengguna p WHERE p.tanggalLahir = :tanggalLahir")
    , @NamedQuery(name = "Pengguna.findByUsername", query = "SELECT p FROM Pengguna p WHERE p.username = :username")
    , @NamedQuery(name = "Pengguna.findByPassword", query = "SELECT p FROM Pengguna p WHERE p.password = :password")
    , @NamedQuery(name = "Pengguna.findByAlamat", query = "SELECT p FROM Pengguna p WHERE p.alamat = :alamat")
    , @NamedQuery(name = "Pengguna.findByLevel", query = "SELECT p FROM Pengguna p WHERE p.level = :level")
    , @NamedQuery(name = "Pengguna.findByJenisKelamin", query = "SELECT p FROM Pengguna p WHERE p.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Pengguna.findByTelephone", query = "SELECT p FROM Pengguna p WHERE p.telephone = :telephone")
    , @NamedQuery(name = "Pengguna.findByEmail", query = "SELECT p FROM Pengguna p WHERE p.email = :email")})
public class Pengguna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pengguna")
    private String idPengguna;
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "jurusan")
    private String jurusan;
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Column(name = "tanggal_lahir")
    private String tanggalLahir;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "level")
    private String level;
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pengguna")
    private Collection<PeminjamanBuku> peminjamanBukuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pengguna")
    private Collection<PeminjamanSkripsi> peminjamanSkripsiCollection;

    public Pengguna() {
    }

    public Pengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
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

    @XmlTransient
    public Collection<PeminjamanBuku> getPeminjamanBukuCollection() {
        return peminjamanBukuCollection;
    }

    public void setPeminjamanBukuCollection(Collection<PeminjamanBuku> peminjamanBukuCollection) {
        this.peminjamanBukuCollection = peminjamanBukuCollection;
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
        hash += (idPengguna != null ? idPengguna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengguna)) {
            return false;
        }
        Pengguna other = (Pengguna) object;
        if ((this.idPengguna == null && other.idPengguna != null) || (this.idPengguna != null && !this.idPengguna.equals(other.idPengguna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persisten.Pengguna[ idPengguna=" + idPengguna + " ]";
    }
    
}
