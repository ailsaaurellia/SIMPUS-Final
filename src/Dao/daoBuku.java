/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interface.IFBuku;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import persisten.Buku;
import persisten.Kategori;

/**
 *
 * @author Ailsa
 */
public class daoBuku implements IFBuku {

    @Override
    public void tambahData(Buku mod) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void ubahData(Buku mod) {
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
        Buku p = em.find(Buku.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Buku getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Buku p = em.find(Buku.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public Buku getByIsbn(String isbn) {
        String jpql = "SELECT b FROM Buku b WHERE b.isbn = :isbn";
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Buku> query = em.createQuery(jpql, Buku.class);
        query.setParameter("isbn", isbn);
        query.setMaxResults(1);
        Buku p = null;
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public List<Buku> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.idbuku) LIKE :idbuku ORDER BY b.idbuku");
        query.setParameter("idbuku", "%" + id.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Buku> getByISBN(String isbn) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.isbn) LIKE :isbn ORDER BY b.idbuku");
        query.setParameter("isbn", "%" + isbn.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Buku> getByJudul(String judul) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.judul) LIKE :judul ORDER BY b.idbuku");
        query.setParameter("judul", "%" + judul.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Buku> getByKategori(String kategori) {
        List<Kategori> kat = new daoKategori().getByKategori(kategori);
        List<Buku> list = new ArrayList();
        for (Kategori k : kat) {
            for (Buku b : k.getBukuCollection()) {
                boolean bol = true;
                for (Buku bk : list) {
                    if (b.getIdbuku().equals(bk.getIdbuku())) {
                        bol = false;
                    }
                }
                if (bol) {
                    list.add(b);
                }
            }
        }
        return list;
    }

    @Override
    public List<Buku> getByPengarang(String pengarang) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.pengarang) LIKE :pengarang ORDER BY b.idbuku");
        query.setParameter("pengarang", "%" + pengarang.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Buku> getByPenerbit(String penerbit) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.penerbit) LIKE :penerbit ORDER BY b.idbuku");
        query.setParameter("penerbit", "%" + penerbit.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Buku> getByTahun(String tahun) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.tahun) LIKE :tahun ORDER BY b.idbuku");
        query.setParameter("tahun", "%" + tahun.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Buku> getByHalaman(String halaman) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT b FROM Buku b WHERE LOWER(b.halaman) LIKE :halaman ORDER BY b.idbuku");
        query.setParameter("halaman", "%" + halaman.toLowerCase() + "%");
        List<Buku> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
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
    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(b.idbuku, LENGTH(b.idbuku) - 2) AS nomor "
                + "FROM Buku b WHERE b.idbuku LIKE 'K%' ORDER BY b.idbuku DESC";
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
