package models;

public class Personne {

        private final String nom;
        private final String prenom;
        private static final int MAX_COPAINS = 10;
        private Personne[] copains;

        public Personne(String nom, String prenom) {
                this.nom = nom;
                this.prenom = prenom;
                this.copains  = new Personne[MAX_COPAINS];
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
                if (aDesCopains==false) {
                        formulation += ")";
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
                        }else if (copains[i]==dernierCopain) {
                                formulation += copains[i].getPrenom()+" "+copains[i].getNom()+")";
                        }
                }
                return formulation;
        }

        public boolean tenterAjoutCopain(Personne copain) {
                boolean aReussi=true;
                boolean estPresent = false;
                int nbreCopains = 0;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i]!=null) {
                                nbreCopains++;
                        }
                        if (copains[i] == copain) {
                                estPresent = true;
                        }
                }
                if (estPresent) {
                        aReussi=false;
                        System.out.println(copain.getPrenom()+" "+copain.getNom()+" est déjà dans la liste");
                }
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == null) {
                                copains[i] = copain;
                                System.out.println("Ajout de l'ami : " + copain.getPrenom()+" "+copain.getNom());
                                break;
                        }else if(nbreCopains==10){
                                aReussi=false;
                                System.out.println("Trop d'ami : échec de l'ajout");
                        }
                }
                return aReussi;
        }

        public boolean tenterSupprimerCopain(Personne copain) {
                boolean aReussi=true;
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
                if (estPresent==false) {
                        aReussi =false;
                        System.out.println(copain.getPrenom()+" "+copain.getNom()+" n'est pas dans la liste");
                }
                if (aDesCopains==false) {
                        aReussi=false;
                        System.out.println("Pas d'ami : échec de suppression");
                }
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain & estPresent==true) {
                                copains[i] = null;
                                System.out.println("Suppression de l'ami : " + copain.getPrenom()+" "+copain.getNom());
                                break;
                        }
                }
                return aReussi;
        }
}