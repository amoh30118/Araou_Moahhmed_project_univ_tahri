class Solver {
    public static boolean resoudre(Echiquier echiquier, int colonne) {
        if (colonne == echiquier.getTaille()) {
            return true; // Toutes les reines sont placées
        }

        for (int ligne = 0; ligne < echiquier.getTaille(); ligne++) {
            Reine reine = new Reine(ligne, colonne);
            echiquier.placerReine(reine, colonne);

            if (echiquier.estValide() && resoudre(echiquier, colonne + 1)) {
                return true;
            }

            echiquier.retirerReine(colonne);
        }

        return false;
    }
}
