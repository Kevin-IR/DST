public abstract class Expertise {

    private String codeDossier;
    private DateTime dateHeureRDV;
    private String lieuRDV;
    private String adresse;
    private String adresse;
    private String immatriculation;
    private String marque;
    private String modele;
    private Indisponibilite uneIndispo;

    public Expertise (String codeDossier, DateTime uneDateHeure, String unLieu, String uneAdresse, String uneImmat, String uneMarque, String unModele){

    }

    public int EtatExpertise(){

    }

    public void CreerIndisponibilite (String unMotif, bool clientResponsable){

    }

    public Indisponibilite getUneIndispo() {
        return uneIndispo;
    }
}
