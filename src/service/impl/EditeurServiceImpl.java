package service.impl;

import business.Editeur;
import service.EditeurService;

import java.util.ArrayList;
import java.util.List;

public class EditeurServiceImpl implements EditeurService {
    private static List<Editeur> editeurs = new ArrayList<>();

    /**
     * Méthode qui ajoute un éditeur en utilisant le nom
     * et le logo donné en paramètre
     *
     * @param nom
     * @param logo
     * @return l'éditeur ajouté
     */
    @Override
    public Editeur ajouterEditeur(String nom, String logo) {
        Editeur nouvelEditeur = new Editeur(nom, logo);
        editeurs.add(nouvelEditeur);
        return nouvelEditeur;
    }

    /**
     * Méthode qui récupère un éditeur par son id
     *
     * @param id
     * @return un éditeur s'il a été trouvé, sinon null
     */
    @Override
    public Editeur recupererEditeur(Long id) {
        for (Editeur editeur : editeurs) {
            if (editeur.getId().equals(id)) {
                return editeur;
            }
        }
        return null;
    }

    /**
     * Méthode qui renvoie tous les éditeurs
     *
     * @return la liste exhaustive des éditeurs
     */
    @Override
    public List<Editeur> recupererEditeurs() {
        // Retourne une copie pour préserver la liste interne
        return new ArrayList<>(editeurs);
    }
}
