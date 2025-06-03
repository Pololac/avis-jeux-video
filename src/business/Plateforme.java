package business;

import java.util.Objects;

public class Plateforme implements Comparable<Plateforme>{
    private Long id;
    private String nom;
    private static Long compteur = 0L;

    // Default constructor (sans paramètre)
    public Plateforme() {
        this.id = ++compteur;
    }

    public Plateforme(String nom) {
        this();
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Plateforme.compteur = compteur;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plateforme that = (Plateforme) o;
        return Objects.equals(id, that.id) && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @Override
    public int compareTo(Plateforme p) {
        return getNom().compareTo(p.getNom());
    }

    @Override
    public String toString() {
        return "Plateforme{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}