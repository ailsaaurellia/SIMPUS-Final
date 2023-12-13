/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Interfacej.IFSkripsi;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import persisten.Kategori;
import persisten.Skripsi;

/**
 *
 * @author Ailsa
 */
public class DaoSkripsi implements IFSkripsi {

    @Override
    public void tambahData(Skripsi mod) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(mod);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void ubahData(Skripsi mod) {
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
        Skripsi p = em.find(Skripsi.class, id);
        em.remove(p);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Skripsi getById(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Skripsi p = em.find(Skripsi.class, id);
        em.getTransaction().commit();
        em.close();
        return p;
    }

    @Override
    public List<Skripsi> getByID(String id) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.idSkripsi) LIKE :idSkripsi ORDER BY s.idSkripsi");
        query.setParameter("idSkripsi", "%" + id.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByJudul(String judul) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.judul) LIKE :judul ORDER BY s.idSkripsi");
        query.setParameter("judul", "%" + judul.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByBahasa(String bahasa) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.bahasa) LIKE :bahasa ORDER BY s.idSkripsi");
        query.setParameter("bahasa", "%" + bahasa.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByFakultas(String fakultas) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.fakultas) LIKE :fakultas ORDER BY s.idSkripsi");
        query.setParameter("fakultas", "%" + fakultas.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByProdi(String prodi) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.programtudi) LIKE :programtudi ORDER BY s.idSkripsi");
        query.setParameter("programtudi", "%" + prodi.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByTahun(String tahun) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.tahun) LIKE :tahun ORDER BY s.idSkripsi");
        query.setParameter("tahun", "%" + tahun.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByPenulis(String penulis) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.penulis) LIKE :penulis ORDER BY s.idSkripsi");
        query.setParameter("penulis", "%" + penulis.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByPembimbing(String pembimbing) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.pembimbing) LIKE :pembimbing ORDER BY s.idSkripsi");
        query.setParameter("pembimbing", "%" + pembimbing.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> getByHalaman(String halaman) {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s WHERE LOWER(s.jumlahHalaman) LIKE :jumlahHalaman ORDER BY s.idSkripsi");
        query.setParameter("jumlahHalaman", "%" + halaman.toLowerCase() + "%");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public List<Skripsi> ambilData() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT s FROM Skripsi s ORDER BY s.idSkripsi");
        List<Skripsi> list = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }

    @Override
    public String nomer() {
        EntityManager em = Persistence.createEntityManagerFactory("UASPBOPU").createEntityManager();
        String jpql = "SELECT SUBSTRING(s.idSkripsi, LENGTH(s.idSkripsi) - 2) AS nomor "
                + "FROM Skripsi s WHERE s.idSkripsi LIKE 'SK%' ORDER BY s.idSkripsi DESC";
        TypedQuery<String> query = em.createQuery(jpql, String.class);
        query.setMaxResults(1);

        String urutan = "";
        try {
            String lastNumber = query.getSingleResult();
            int nextNumber = Integer.parseInt(lastNumber) + 1;
            urutan = "SK" + String.format("%03d", nextNumber);
        } catch (NoResultException e) {
            // Jika tidak ada data, mulai dari 001
            urutan = "SK001";
        }

        em.close();
        return urutan;
    }

    @Override
    public List<Skripsi> getByKategori(String kategori) {
       List<Kategori> kat = new DaoKategori().getByKategori(kategori);
        List<Skripsi> list = new ArrayList();
        for(Kategori k : kat){
            for(Skripsi b: k.getSkripsiCollection()){
                boolean bol = true;
                for(Skripsi bk : list){
                    if(b.getIdSkripsi().equals(bk.getIdSkripsi()))
                        bol = false;
                }
                if(bol)
                    list.add(b);
            }
        }
        return list;
    }

}
