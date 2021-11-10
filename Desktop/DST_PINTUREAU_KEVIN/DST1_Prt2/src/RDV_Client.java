public class RDV_Client extends Expertise {

    private String nomContact;
    private String telephone;
    private String email;

    public RDV_Client(String codeDossier, DateTime uneDateHeure, String unLieu, String uneAdresse, String uneImmat, String uneMarque, String unModele, String contact, String tel, String email) :base(codeDossier, uneDateHeure, unLieu, uneAdresse, uneImmat, uneMarque, unModele) {

    }

}