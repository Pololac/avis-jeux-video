import business.*;
import service.EditeurService;
import service.PlateformeService;
import service.impl.EditeurServiceImpl;
import service.impl.PlateformeServiceImpl;
import utils.ComparateurDEditeursSurLogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static EditeurService editeurService = new EditeurServiceImpl();
    private static PlateformeService plateformeService = new PlateformeServiceImpl();

    public static void main(String[] args) {
        // Utilisateurs
        List<Utilisateur> utilisateurs = new ArrayList<>();
        List<Editeur> editeurs = new ArrayList<>();

        Moderateur moderateur = new Moderateur("Anddy", "anddy@humanbooster.com", "admin", "0612345678");
        utilisateurs.add(moderateur);
        // Le "sout" invoque la méthode toString() de l'objet moderateur()
        System.out.println(moderateur);

        Joueur joueur1 = new Joueur("a", "a@gmail.com", "1234", LocalDate.of(2000, 1, 1));
        Joueur joueur2 = new Joueur("a", "a@gmail.com", "1234", LocalDate.of(2000, 1, 1));
        utilisateurs.add(joueur1);
        utilisateurs.add(joueur2);

        for (Utilisateur utilisateur : utilisateurs) {
            System.out.println(utilisateur);
            if( utilisateur instanceof Joueur) {
                System.out.println("- " + ((Joueur) utilisateur).getDateDeNaissance());
            } else if( utilisateur instanceof Moderateur) {
                System.out.println("- " + ((Moderateur) utilisateur).getNumeroDeTelephone());
            }
        }

        System.out.println("- " + joueur1);
        System.out.println("- " + joueur2);
        System.out.println("-- Equals: " + joueur1.equals(joueur2));
        System.out.println("-- HashCode Joueur 1 : " + joueur1.hashCode());
        System.out.println("-- HashCode Joueur 2 : " + joueur2.hashCode());

        // Editeurs

        // Il est préférable de déclarer une collection par son interface
        // pour pouvoir choisir avec le new le type d'implémentation

        /*
        Editeur editeur1 = new Editeur("CapCom", "capcom.png");
        Editeur editeur2 = new Editeur("Ubisoft", "ubisoft.png");
        Editeur editeur3 = new Editeur("Riot", "riot.png");
        editeurs.add(editeur1);
        editeurs.add(editeur2);
        editeurs.add(editeur3);

        // On trie la liste des éditeurs, avec Collections.sort sur le nom de chaque éditeur
        Collections.sort(editeurs);
        System.out.println(editeurs);

        // On trie la liste des éditeurs, avec Collections.sort sur le nom de chaque éditeur
        Collections.sort(editeurs, new ComparateurDEditeursSurLogo(){});
        System.out.println(editeurs);
        */

        editeurService.ajouterEditeur("Activision", "activision.com");
        editeurService.ajouterEditeur("Amazon Games","amazongames.com");
        editeurService.ajouterEditeur("Ankama", "ankama.com");
        editeurService.ajouterEditeur("Bandai Namco", "bandai.co.jp");
        editeurService.ajouterEditeur("Bethesda", "bethesda.net");
        editeurService.ajouterEditeur("BioWare", "bioware.com");
        editeurService.ajouterEditeur("Blizzard", "blizzard.com");
        editeurService.ajouterEditeur("Capcom", "capcom.com");
        editeurService.ajouterEditeur("CCP", "ccpgames.com");
        editeurService.ajouterEditeur("CD Projekt Red", "cdprojekt.com");
        editeurService.ajouterEditeur("Davilex", "davilex.nl");
        editeurService.ajouterEditeur("Digital Extreme", "digitalextremes.com");
        editeurService.ajouterEditeur("Electronic Arts", "ea.com");
        editeurService.ajouterEditeur("Epic Games", "epicgames.com");
        editeurService.ajouterEditeur("FromSoftware", "fromsoftware.jp");
        editeurService.ajouterEditeur("Hazelight Studios", "hazelight.se");
        editeurService.ajouterEditeur("idSoftware", "idsoftware.com");
        editeurService.ajouterEditeur("Microsoft", "microsoft.com");
        editeurService.ajouterEditeur("Mobius Digital", "mobiusdigitalgames.com");
        editeurService.ajouterEditeur("MonolithSoftware", "monolithsoft.co.jp");
        editeurService.ajouterEditeur("Naughty Dog", "naughtydog.com");
        editeurService.ajouterEditeur("Nintendo", "nintendo.com");
        editeurService.ajouterEditeur("Riot Games", "riotgames.com");
        editeurService.ajouterEditeur("Rockstar", "rockstar.com");
        editeurService.ajouterEditeur("Sega", "sega.com");
        editeurService.ajouterEditeur("Square Enix", "squareenix.com");
        editeurService.ajouterEditeur("Tencent", "tencentgames.com");
        editeurService.ajouterEditeur("Ubisoft", "ubisoft.com");
        editeurService.ajouterEditeur("Ultra Software", null);
        editeurService.ajouterEditeur("Valve", "valvesoftware.com");
        editeurService.ajouterEditeur("Wildcard", "wildcardmobile.com");

        //Affichage
        System.out.println(editeurService.recupererEditeurs());


        // Plateformes
        /*
        Plateforme plateforme1 = new Plateforme("Steam");
        Plateforme plateforme2 = new Plateforme("Epic Games");
        Plateforme plateforme3 = new Plateforme("Origin");
        List<Plateforme> plateformes = new Vector<>();
        plateformes.add(plateforme1);
        plateformes.add(plateforme2);
        plateformes.add(plateforme3);
        Collections.sort(plateformes);
        System.out.println(plateformes);
        */

        //Ajout
        List<String> nomsPlateforme = List.of("Amstrad CPC","Nintendo Wii","Nintendo Wii U", "Nintendo Switch","Windows","MacOS","Steam","Neo-Geo","PlayStation 1","PlayStation 2","PlayStation 3","PlayStation 4","PlayStation 5","PlayStation Vita","PSP","Sega Dreamcast","Sega Mastersystem","Sega Saturn","Xbox One","Xbox One Series","Xbox 360","Amiga","Android","Atari 8-bit","Atari Jaguar","Commodore 64","Game Boy","Game Boy Color","Game Boy Advance","Game Boy Advance SP","NES","PC-Engine","SNES","Nintendo 3DS","Nintendo 64","Nintendo DS","Nintendo Gamecube");
        for (String nom : nomsPlateforme) {
            plateformeService.ajouterPlateforme(nom);
        }

        //Affichage
        System.out.println(plateformeService.recupererPlateformes());


    }
}