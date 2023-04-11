import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServeurMatriceImpl extends UnicastRemoteObject implements ServeurMatrice {

    // Implémentation des méthodes de l'interface ServeurMatrice
    public int[][] sommeMatrices(int[][] matrice1, int[][] matrice2) throws RemoteException {
        // Logique pour la somme de matrices
    }

    public int[][] multiplicationMatrices(int[][] matrice1, int[][] matrice2) throws RemoteException {
        // Logique pour la multiplication de matrices
    }

    public int[][] transposerMatrice(int[][] matrice) throws RemoteException {
        // Logique pour la transposition de matrice
    }

    // Constructeur de la classe
    public ServeurMatriceImpl() throws RemoteException {
        super(); // Appel au constructeur de UnicastRemoteObject
    }
}

public class GestionUtilisateursImpl extends UnicastRemoteObject implements GestionUtilisateurs {

    private HashMap<String, String> utilisateurs; // Liste des utilisateurs avec leur mot de passe

    // Constructeur de la classe
    public GestionUtilisateursImpl() throws RemoteException {
        utilisateurs = new HashMap<>();
    }

    // Implémentation des méthodes de l'interface GestionUtilisateurs
    public boolean sIdentifier(String id, String pass) throws RemoteException {
        // Vérifier si l'utilisateur existe et si le mot de passe est correct
        String password = utilisateurs.get(id);
        return password != null && password.equals(pass);
    }

    public void ajouterUtilisateur(String id, String pass) throws RemoteException {
        // Ajouter un nouvel utilisateur à la liste
        utilisateurs.put(id, pass);
    }
}
