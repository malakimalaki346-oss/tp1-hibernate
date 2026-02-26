package com.example;

import com.example.model.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // 🔹 Création EntityManager
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("demoPU");
        EntityManager em = emf.createEntityManager();

        // 🔹 INSERTION
        em.getTransaction().begin();

        em.persist(new Produit("Casque Audio", 149.50));
        em.persist(new Produit("Souris Gaming", 59.90));
        em.persist(new Produit("Ecran 24 pouces", 219.00));

        em.getTransaction().commit();

        System.out.println("✔ Insertion terminée avec succès !");

        // 🔹 LISTE DES PRODUITS
        System.out.println("\n📦 Liste des produits :");

        List<Produit> produits =
                em.createQuery("SELECT p FROM Produit p", Produit.class)
                        .getResultList();

        for (Produit p : produits) {
            System.out.println(p);
        }

        // 🔹 RECHERCHE PAR ID
        System.out.println("\n🔍 Recherche du produit avec ID=2 :");

        Produit produit = em.find(Produit.class, 2L);
        System.out.println(produit);

        // 🔹 Fermeture
        em.close();
        emf.close();
    }
}