class Echiquier {
    private Reine[] reines;
    private int taille;

    public Echiquier(int taille) {
        this.taille = taille;
        this.reines = new Reine[taille];
    }

    public int getTaille() {
        return taille;
    }

    // Méthode pour placer une reine sur l'échiquier
    public void placerReine(Reine reine, int colonne) {
        reines[colonne] = reine;
    }

    // Méthode pour retirer une reine de l'échiquier
    public void retirerReine(int colonne) {
        reines[colonne] = null;
    }

    // Méthode pour vérifier si l'échiquier est valide
    public boolean estValide() {
        for (int i = 0; i < taille; i++) {
            for (int j = i + 1; j < taille; j++) {
                if (reines[i] != null && reines[j] != null && reines[i].menace(reines[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    // Méthode pour afficher l'échiquier
    public void afficher() {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (reines[j] != null && reines[j].getLigne() == i) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
