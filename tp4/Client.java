import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            // Récupérer les objets distants du serveur
            ServeurMatrice serveurMatrice = (ServeurMatrice) Naming.lookup("rmi://localhost/ServeurMatrice");
            GestionUtilisateurs gestionUtilisateurs = (GestionUtilisateurs) Naming.lookup("rmi://localhost/GestionUtilisateurs");

            // Authentification de l'utilisateur
            String id = "nom_utilisateur";
            String pass = "mot_de_passe";
            boolean authentifie = gestionUtilisateurs.sIdentifier(id, pass);
            if (authentifie) {
                System.out.println("Authentification réussie.");

                // Génération aléatoire des matrices
                int[][] matrice1 = genererMatrice();
                int[][] matrice2 = genererMatrice();

                // Appel aux méthodes distantes pour effectuer les opérations matricielles
                int[][] somme = serveurMatrice.sommeMatrices(matrice1, matrice2);
                int[][] produit = serveurMatrice.multiplicationMatrices(matrice1, matrice2);
                int[][] transposee = serveurMatrice.transposerMatrice(matrice1);

                // Affichage des résultats
                System.out.println("Somme des matrices :");
                afficherMatrice(somme);
                System.out.println("Produit des matrices :");
                afficherMatrice(produit);
                System.out.println("Transposée de la première matrice :");
                afficherMatrice(transposee);
            } else {
                System.out.println("Authentification échouée. Vérifiez vos identifiants.");
            }
        } catch (Exception e) {
            System.err.println("Erreur lors de l'exécution du client : " + e.getMessage());
            e.printStackTrace();
        }
    }

   // Méthode pour générer une matrice aléatoire
   public static int[][] genererMatrice() {
    // Code pour générer une matrice aléatoire (à compléter selon vos besoins)
}

// Méthode pour afficher une matrice
public static void afficherMatrice(int[][] matrice) {
    // Code pour afficher une matrice (à compléter selon vos besoins)
}
}

