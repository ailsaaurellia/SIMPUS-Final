/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interfacej.IFPengguna;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import persisten.Pengguna;

/**
 *
 * @author Ailsa
 */
public class DaoPengguna implements IFPengguna {

    @Override
    public void tambahData(Pengguna mod) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void ubahData(Pengguna mod) {
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
        Pengguna p = em.find(Pengguna.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Pengguna getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Pengguna p = em.find(Pengguna.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public List<Pengguna> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.idPengguna) LIKE :idPengguna ORDER BY p.idPengguna");
        query.setParameter("idPengguna", "%" + id.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByNim(String nim) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.nim) LIKE :nim ORDER BY p.idPengguna");
        query.setParameter("nim", "%" + nim.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByNama(String nama) {
     EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.nama) LIKE :nama ORDER BY p.idPengguna");
        query.setParameter("nama", "%" + nama.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByJurusan(String jurusan) {
       EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.jurusan) LIKE :jurusan ORDER BY p.idPengguna");
        query.setParameter("jurusan", "%" + jurusan.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByTempatlahir(String tempatLahir) {
       EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.tempatLahir) LIKE :tempatLahir ORDER BY p.idPengguna");
        query.setParameter("tempatLahir", "%" + tempatLahir.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByTanggallahir(String tanggalLahir) {
       EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.tanggalLahir) LIKE :tanggalLahir ORDER BY p.idPengguna");
        query.setParameter("tanggalLahir", "%" + tanggalLahir.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByUsername(String username) {
       EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.username) LIKE :username ORDER BY p.idPengguna");
        query.setParameter("username", "%" + username.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByPassword(String password) {
     EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.password) LIKE :password ORDER BY p.idPengguna");
        query.setParameter("password", "%" + password.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByAlamat(String alamat) {
       EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.alamat) LIKE :alamat ORDER BY p.idPengguna");
        query.setParameter("alamat", "%" + alamat.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByLevel(String level) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.level) LIKE :level ORDER BY p.idPengguna");
        query.setParameter("level", "%" + level.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByJeniskelamin(String jenisKelamin) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.jenisKelamin) LIKE :jenisKelamin ORDER BY p.idPengguna");
        query.setParameter("jenisKelamin", "%" + jenisKelamin.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByTelephone(String telephone) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.telephone) LIKE :telephone ORDER BY p.idPengguna");
        query.setParameter("telephone", "%" + telephone.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> getByEmail(String email) {
      EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p WHERE LOWER(p.email) LIKE :email ORDER BY p.idPengguna");
        query.setParameter("email", "%" + email.toLowerCase() + "%");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Pengguna> ambilData() {
     EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT p FROM Pengguna p ORDER BY p.idPengguna");
        List<Pengguna> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public String nomer() {
       EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(p.idPengguna, LENGTH(p.idPengguna) - 2) AS nomor "
                + "FROM Pengguna p WHERE p.idPengguna LIKE 'PG%' ORDER BY p.idPengguna DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);

        String urutan = "";
        try {
            String lastNumber = query.getSingleResult();
            int nextNumber = Integer.parseInt(lastNumber) + 1;
            urutan = "PG01" + String.format("%03d", nextNumber);
        } catch (NoResultException e) {
            // Jika tidak ada data, mulai dari 001
            urutan = "PG01";
        }

        em.close();
        return urutan;
    }


}
