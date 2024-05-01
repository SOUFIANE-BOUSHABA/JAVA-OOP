class Employé {
    private String nom;
    private int numeroEmployé;
    private double salaire;
    
    public Employé(String nom, int numeroEmployé, double salaire) {
        this.nom = nom;
        this.numeroEmployé = numeroEmployé;
        this.salaire = salaire;
    }
    
    public String getNom() {
        return nom;
    }

    public int getNumeroEmployé() {
        return numeroEmployé;
    }

    public double getSalaire() {
        return salaire;
    }

    public void ajusterSalaire(double pourcentage) {
        salaire += salaire * (pourcentage / 100);
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Numéro d'employé: " + numeroEmployé);
        System.out.println("Salaire: " + salaire);
    }
}