// Classe Reine pour représenter une reine
class Reine {
    private int ligne;
    private int colonne;

    public Reine(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    // Méthode pour vérifier si une reine menace une autre
    public boolean menace(Reine autreReine) {
        return this.ligne == autreReine.ligne ||
               this.colonne == autreReine.colonne ||
               Math.abs(this.ligne - autreReine.ligne) == Math.abs(this.colonne - autreReine.colonne);
    }
}