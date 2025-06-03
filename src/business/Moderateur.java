package business;

import java.util.Objects;

public class Moderateur extends Utilisateur {
    private String numeroDeTelephone;

    public Moderateur(String pseudo, String email, String motDePasse, String numeroDeTelephone) {
        super(pseudo, email, motDePasse);
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroDeTelephone);
    }

    @Override
    public String toString() {
        return "Moderateur{" +
                "numeroDeTelephone='" + numeroDeTelephone + '\'' +
                ", id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
}
