/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interfacej.IFKategori;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import persisten.Kategori;

/**
 *
 * @author Ailsa
 */
public class DaoKategori implements IFKategori {
    @Override
    public void tambahData(Kategori mod) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void ubahData(Kategori mod) {
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
        Kategori p = em.find(Kategori.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Kategori getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Kategori p = em.find(Kategori.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public List<Kategori> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT k FROM Kategori k WHERE LOWER(k.idkategori) LIKE :idkategori ORDER BY k.idkategori");
        query.setParameter("idkategori", "%" + id.toLowerCase() + "%");
        List<Kategori> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Kategori> getByKategori(String kategori) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT k FROM Kategori k WHERE LOWER(k.kategori) LIKE :kategori ORDER BY k.idkategori");
        query.setParameter("kategori", "%" + kategori.toLowerCase() + "%");
        List<Kategori> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Kategori> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT k FROM Kategori k ORDER BY k.idkategori");
        List<Kategori> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(k.idkategori, LENGTH(k.idkategori) - 2) AS nomor "
                + "FROM Kategori k WHERE k.idkategori LIKE 'K%' ORDER BY k.idkategori DESC";
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
