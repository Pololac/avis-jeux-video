package business;

public abstract class Utilisateur {
    private Long id;
    private String pseudo;
    private String email;
    private String motdeDePasse;
    private static Long compteur = 0L;

    public Utilisateur(String pseudo, String email, String motdeDePasse) {
        this.id = compteur++;
        this.pseudo = pseudo;
        this.email = email;
        this.motdeDePasse = motdeDePasse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdeDePasse() {
        return motdeDePasse;
    }

    public void setMotdeDePasse(String motdeDePasse) {
        this.motdeDePasse = motdeDePasse;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", motdeDePasse='" + motdeDePasse + '\'' +
                '}';
    }
}
