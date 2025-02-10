package models;

public class Personne {

        private final String nom;
        private final String prenom;
        private static final int MAX_COPAINS = 10;
        private Personne[] copains = new Personne[MAX_COPAINS];

        public Personne(String nom, String prenom) {
                this.nom = nom;
                this.prenom = prenom;
        }

        public String getNom(){
                return nom.toUpperCase();
        }
        public String getPrenom(){
                return prenom;
        }

        public String toString() {
                String formulation = prenom + " " + nom.toUpperCase()+" et ses copains (";
                boolean aDesCopains = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i]!=null) {
                                aDesCopains = true;
                        }
                }
                Personne dernierCopain = null;
                for (int i = copains.length-1; i >=0; i--) {
                        if (copains[i]!=null) {
                                dernierCopain=copains[i];
                                break;
                        }
                }
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i]!=null && copains[i]!=dernierCopain) {
                                formulation +=copains[i].getPrenom()+" "+copains[i].getNom()+", ";
                        }else if(aDesCopains==false){
                                formulation += ")";
                                break;
                        }else if (copains[i]==dernierCopain) {
                                formulation += copains[i].getPrenom()+" "+copains[i].getNom()+")";
                        }
                }
                return formulation;
        }

        public void tenterAjoutCopain(Personne copain) {
                boolean estPresent = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain) {
                                estPresent = true;
                        }
                }
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == null & estPresent==false) {
                                copains[i] = copain;
                                System.out.println("Ajout de l'ami : " + copain.getPrenom()+" "+copain.getNom());
                                break;
                        }else if(estPresent==true){
                                System.out.println(copain.getPrenom()+" "+copain.getNom()+" est déjà dans la liste");
                                break;
                        }else if(copains[MAX_COPAINS-1] != null & estPresent==false){
                                System.out.println("Trop d'ami : échec de l'ajout");
                        }
                }
        }

        public void tenterSupprimerCopain(Personne copain) {
                boolean estPresent = false;
                boolean aDesCopains = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain) {
                                estPresent = true;
                                aDesCopains = true;
                                break;
                        }else if (copains[i] !=null) {
                                aDesCopains = true;
                        }
                }
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain & estPresent==true) {
                                copains[i] = null;
                                System.out.println("Suppression de l'ami : " + copain.getPrenom()+" "+copain.getNom());
                                break;
                        }else if(estPresent==false){
                                System.out.println(copain.getPrenom()+" "+copain.getNom()+" n'est pas dans la liste");
                                break;
                        }else if(copains[MAX_COPAINS-1] == null & aDesCopains==false){
                                System.out.println("Pas d'ami : échec de suppression");
                        }
                }
        }
}