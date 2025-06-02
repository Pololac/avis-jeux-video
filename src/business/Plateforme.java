package business;

public class Plateforme {
    private Long id;
    private String nom;
    private static Long compteur = 0L;

    // Default constructor (sans paramètre)
    public Plateforme() {
        this.id = compteur++;
    }

    public Plateforme(String nom) {
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
    public String toString() {
        return "Plateforme{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
 CCS-30-Prototypage-haute-fidélité
