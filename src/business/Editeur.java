package business;

public class Editeur {

    private Long id;
    private String nom;
    private String logo;
    private static Long compteur = 0L;


    // Default constructor (sans paramètre)
    public Editeur() {
        this.id = compteur++;
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
    public String toString() {
        return "Editeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}