package business;

public class Moderateur extends Utilisateur {
    private String numeroDeTelephone;

    public Moderateur(String pseudo, String email, String motdeDePasse, String numeroDeTelephone) {
        super(pseudo, email, motdeDePasse);
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    @Override
    public String toString() {
        return "Moderateur{" +
                "numeroDeTelephone='" + numeroDeTelephone + '\'' +
                '}';
    }
}
