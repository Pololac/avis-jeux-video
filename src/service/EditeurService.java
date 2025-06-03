package service;

import business.Editeur;

import java.util.List;

public interface EditeurService {
    Editeur ajouterEditeur(String nom, String logo);

    Editeur recupererEditeur(Long id);

    List<Editeur> recupererEditeurs();
}
