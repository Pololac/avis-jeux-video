package utils;

import business.Editeur;

import java.util.Comparator;

public class ComparateurDEditeursSurLogo implements Comparator<Editeur> {

    @Override
    public int compare(Editeur editeur1, Editeur editeur2) {
        return editeur1.getLogo().compareTo(editeur2.getLogo());
    }
}