/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Config.Koneksi;
import Interface.IFBuku;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import persisten.Buku;

/**
 *
 * @author Ailsa
 */
public class daoBuku implements IFBuku {

    @Override
    public void tambahData(Buku mod) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mod);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void perbaruiData(Buku mod) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mod);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void hapusData(Buku mod) {
      EntityManager entityManager = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mod);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Buku getByid(String id) {
        return null;
        
    }


    @Override
    public List<Buku> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b ORDER BY b.idbuku");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public String nomor() {
        EntityManager em = Persistence.createEntityManagerFactory("LibraLinxPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(b.idbuku, LENGTH(b.idbuku) - 2) AS nomor "
                + "FROM Buku b WHERE b.idbuku LIKE 'BK%' ORDER BY b.idbuku DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);
        Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat nonformat = new SimpleDateFormat("yyMMdd");
        tanggal.format(now);
        String no = nonformat.format(now);
        String urutan = "";
        try {
            urutan = "BK" + no + String.format("%03d", Integer.parseInt(query.getSingleResult()) + 1);
        } catch (NoResultException e) {
            urutan = "BK" + no + "001";
        }
        em.close();
        return urutan;
}
}
