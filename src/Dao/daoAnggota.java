/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interface.IFAnggota;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import persisten.Anggota;

/**
 *
 * @author Ailsa
 */
public class daoAnggota implements IFAnggota {

    @Override
    public void tambahData(Anggota mod) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void ubahData(Anggota mod) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void hapusData(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Anggota p = em.find(Anggota.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Anggota getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Anggota p = em.find(Anggota.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public List<Anggota> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.idAnggota) LIKE :idAnggota ORDER BY a.idAnggota");
        query.setParameter("idAnggota", "%" + id.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByNama(String nama) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.nama) LIKE :nama ORDER BY a.idAnggota");
        query.setParameter("nama", "%" + nama.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByNim(String nim) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.nim) LIKE :nim ORDER BY a.idAnggota");
        query.setParameter("nim", "%" + nim.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByFakultas(String fakultas) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.fakultas) LIKE :fakultas ORDER BY a.idAnggota");
        query.setParameter("fakultas", "%" + fakultas.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByProdi(String prodi) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.programStudi) LIKE :programStudi ORDER BY a.idAnggota");
        query.setParameter("programStudi", "%" + prodi.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByAngkatan(String angkatan) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.angkatan) LIKE :angkatan ORDER BY a.idAnggota");
        query.setParameter("angkatan", "%" + angkatan.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByAlamat(String alamat) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.alamat) LIKE :alamat ORDER BY a.idAnggota");
        query.setParameter("alamat", "%" + alamat.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByTelephone(String telp) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.telephone) LIKE :telephone ORDER BY a.idAnggota");
        query.setParameter("telephone", "%" + telp.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByEmail(String email) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.email) LIKE :email ORDER BY a.idAnggota");
        query.setParameter("email", "%" + email.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> getByJenis(String jenis) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a WHERE LOWER(a.jenisKelamin) LIKE :jenisKelamin ORDER BY a.idAnggota");
        query.setParameter("jenisKelamin", "%" + jenis.toLowerCase() + "%");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Anggota> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Anggota a ORDER BY a.idAnggota");
        List<Anggota> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(a.idAnggota, LENGTH(a.idAnggota) - 2) AS nomor "
                + "FROM Anggota a WHERE a.idAnggota LIKE 'K%' ORDER BY a.idAnggota DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);
        String urutan = "";
        try {
            urutan = "K" + String.format("%03d", Integer.parseInt(query.getSingleResult()) + 1);
        } catch (NoResultException e) {
            urutan = "K001";
        }
        em.close();
        return urutan;

    }

}
