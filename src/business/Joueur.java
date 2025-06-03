package business;

import java.time.LocalDate;
import java.util.Objects;

public class Joueur extends Utilisateur{
    private LocalDate dateDeNaissance;

    public Joueur(String pseudo, String email, String motDePasse, LocalDate dateDeNaissance) {
        super(pseudo, email, motDePasse);
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Joueur joueur = (Joueur) o;
        return Objects.equals(dateDeNaissance, joueur.dateDeNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateDeNaissance);
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "dateDeNaissance=" + dateDeNaissance +
                ", id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
}
