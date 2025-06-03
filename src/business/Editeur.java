package business;

import java.util.Objects;

public class Editeur implements Comparable<Editeur> {
    private Long id;
    private String nom;
    private String logo;

    private static Long compteur = 0L;


    // Default constructor (sans paramètre)
    public Editeur() {
        this.id = ++compteur;
    }

    // Constructeur avec paramètre
    public Editeur(String nom) {
        this();
        this.nom = nom;
    }

    public Editeur(String nom, String logo) {
        this(nom);
        this.logo = logo;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Editeur editeur = (Editeur) o;
        return Objects.equals(id, editeur.id) && Objects.equals(nom, editeur.nom) && Objects.equals(logo, editeur.logo);
    }

    @Override   // 31 éditeurs
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(nom);
        result = 31 * result + Objects.hashCode(logo);
        return result;
    }

    /**
     * On montre à java comment comparer deux objets Editeur : l'objet this et celui donné en paramètre
     * @param autreEditeur the object to be compared.
     * On décide de comparer les éditeurs par leur nom.
     * @return
     */
    @Override
    public int compareTo(Editeur autreEditeur) {
        return getNom().compareTo(autreEditeur.getNom());
    }

    @Override
    public String toString() {
        return "Editeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}