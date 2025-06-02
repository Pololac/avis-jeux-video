package business;

import java.time.LocalDate;

public class Jeu {
    private Long id;
    private String nom;
    private LocalDate dateSortie;
    private String description;
    private boolean possedeImage;
    private static Long compteur = 0L;

    public Jeu() {
        this.id = compteur++;
    }

    public Jeu(String nom) {
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

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPossedeImage() {
        return possedeImage;
    }

    public void setPossedeImage(boolean possedeImage) {
        this.possedeImage = possedeImage;
    }

    @Override
    public String toString() {
        return "Jeu{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateSortie=" + dateSortie +
                ", description='" + description + '\'' +
                ", possedeImage=" + possedeImage +
                '}';
    }
}
