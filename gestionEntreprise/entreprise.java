import java.util.ArrayList;
class Entreprise {
    private ArrayList<Département> départements = new ArrayList<>();
    
    public void ajouterDépartement(Département département) {
        départements.add(département);
    }

    public Employé rechercherEmployéParNuméro(int numéro) {
        for (Département d : départements) {
            for (Employé e : d.getEmployés()) {
                if (e.getNumeroEmployé() == numéro) {
                    return e;
                }
            }
        }
        return null; 
    }

    public double calculerMasseSalarialeTotale() {
        double masseSalarialeTotale = 0;
        for (Département d : départements) {
            masseSalarialeTotale += d.calculerMasseSalariale();
        }
        return masseSalarialeTotale;
    }
}