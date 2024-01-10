public class HuitReines {
    public static void main(String[] args) {
        // Étape 2: Modélisation Orientée Objet
        int tailleEchiquier = 8;
        Echiquier echiquier = new Echiquier(tailleEchiquier);

        // Étape 3: Implémentation de l'Algorithme
        // Utilisation du solver pour résoudre le problème
        if (Solver.resoudre(echiquier, 0)) {
            // Étape 4: Conclusion
            // Affichage de la solution
            System.out.println("Solution trouvée :");
            echiquier.afficher();
        } else {
            System.out.println("Aucune solution trouvée.");
        }
    }
}