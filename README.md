TP1 — Introduction à Hibernate et JPA

Étape 1 : Création du projet

J’ai créé un projet Maven afin de gérer les dépendances du projet. J’ai ensuite ajouté les bibliothèques nécessaires, notamment Hibernate, JPA et la base de données H2 pour travailler avec une base en mémoire.

Étape 2 : Configuration et création de l’entité

J’ai configuré Hibernate à l’aide du fichier persistence.xml. Ensuite, j’ai créé une entité simple nommée Produit en utilisant les annotations JPA pour permettre le mapping entre la classe Java et la table de la base de données.

Étape 3 : Implémentation des opérations

J’ai développé une classe principale permettant d’insérer plusieurs produits, d’afficher la liste des produits enregistrés et de rechercher un produit par son identifiant.

![WhatsApp Image 2026-02-26 at 00 53 54](https://github.com/user-attachments/assets/4c704a6d-0b76-488b-b896-bdf5cdac095b)
![WhatsApp Image 2026-02-26 at 00 54 52](https://github.com/user-attachments/assets/a2fed77c-4a27-461b-b81a-5edf0ea5025f)
![WhatsApp Image 2026-02-26 at 00 55 46](https://github.com/user-attachments/assets/6e836dec-f367-491f-8d4e-2804be4ab3ff)

Les tests d’exécution ont montré que la persistance et la lecture des données fonctionnent correctement.




