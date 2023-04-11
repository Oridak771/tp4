import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] args) {
        try {
            // Créer et enregistrer l'objet distant pour les opérations matricielles
            ServeurMatriceImpl serveurMatrice = new ServeurMatriceImpl();
            LocateRegistry.createRegistry(1099); // Créer le registre RMI sur le port 1099
            Naming.rebind("ServeurMatrice", serveurMatrice); // Enregistrer l'objet distant avec le nom "ServeurMatrice" dans le registre

            // Créer et enregistrer l'objet distant pour la gestion des utilisateurs
            GestionUtilisateursImpl gestionUtilisateurs = new GestionUtilisateursImpl();
            Naming.rebind("GestionUtilisateurs", gestionUtilisateurs); // Enregistrer l'objet distant avec le nom "GestionUtilisateurs" dans le registre

            System.out.println("Le serveur est prêt.");
        } catch (Exception e) {
            System.err.println("Erreur lors de l'enregistrement du serveur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

