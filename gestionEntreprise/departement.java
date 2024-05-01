import java.util.ArrayList;
class Département {
    private String nom;
    private Employé responsable;
    private ArrayList<Employé> employés = new ArrayList<>();
    
    public Département(String nom, Employé responsable) {
        this.nom = nom;
        this.responsable = responsable;
    }
    
    public String getNom() {
        return nom;
    }

    public Employé getResponsable() {
        return responsable;
    }

    public void ajouterEmployé(Employé employé) {
        employés.add(employé);
    }

    public void supprimerEmployé(Employé employé) {
        employés.remove(employé);
    }

    public double calculerMasseSalariale() {
        double masseSalariale = responsable.getSalaire();
        for (Employé e : employés) {
            masseSalariale += e.getSalaire();
        }
        return masseSalariale;
    }
}
