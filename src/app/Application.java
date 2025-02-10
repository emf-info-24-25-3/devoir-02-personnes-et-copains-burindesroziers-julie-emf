package app;
import models.*;

public class Application {
        public static void main(String[] args) {
                Personne pers1 = new Personne("Terrieur", "Alex");
                Personne pers2 = new Personne("Terrieur", "Alain");
                Personne pers3 = new Personne ("D'Oeuf","John");
                Personne pers4 = new Personne ("Haroni","Mac");

                pers1.tenterAjoutCopain(pers3);
                pers1.tenterAjoutCopain(pers2);
                pers1.tenterAjoutCopain(pers3);
                pers1.tenterSupprimerCopain(pers3);
                pers1.tenterSupprimerCopain(pers3);
                pers1.tenterAjoutCopain(pers4);
                pers1.tenterSupprimerCopain(pers2);

                System.out.println(pers1.toString());
        }
}
