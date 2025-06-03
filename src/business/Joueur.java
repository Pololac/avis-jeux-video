package business;

import java.time.LocalDate;

public class Joueur extends Utilisateur{
    private LocalDate dateDeNaissance;

    public Joueur(String pseudo, String email, String motdeDePasse, LocalDate dateDeNaissance) {
        super(pseudo, email, motdeDePasse);
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "dateDeNaissance=" + dateDeNaissance +
                '}';
    }
}
