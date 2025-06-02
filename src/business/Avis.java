package business;

import java.time.LocalDateTime;

public class Avis {
    private Long id;
    private String contenu;
    private float note;
    private LocalDateTime dateDeCreation;
    private static Long compteur = 0L;

    public Avis() {
        this.id = compteur++;
    }

    public Avis(String contenu, float note) {
        this();
        this.contenu = contenu;
        this.note = note;
        this.dateDeCreation = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public LocalDateTime getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDateTime dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    @Override
    public String toString() {
        return "Avis{" +
                "id=" + id +
                ", contenu='" + contenu + '\'' +
                ", note=" + note +
                ", dateDeCreation=" + dateDeCreation +
                '}';
    }
}
