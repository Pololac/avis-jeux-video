package business;

import java.util.Objects;

public abstract class Utilisateur {
    protected Long id;
    protected String pseudo;
    protected String email;
    protected String motDePasse;
    private static Long compteur = 0L;

    protected Utilisateur(String pseudo, String email, String motDePasse) {
        this.id = ++compteur;
        this.pseudo = pseudo;
        this.email = email;
        this.motDePasse = motDePasse;
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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Utilisateur utilisateur = (Utilisateur) o;
        return Objects.equals(id, utilisateur.id) &&
               Objects.equals(pseudo, utilisateur.pseudo) &&
               Objects.equals(email, utilisateur.email) &&
               Objects.equals(motDePasse, utilisateur.motDePasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pseudo, email, motDePasse);
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", motdeDePasse='" + motDePasse + '\'' +
                '}';
    }
}
