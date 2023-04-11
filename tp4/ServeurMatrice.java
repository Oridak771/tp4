import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServeurMatrice extends Remote {
    int[][] sommeMatrices(int[][] matrice1, int[][] matrice2) throws RemoteException;
    int[][] multiplicationMatrices(int[][] matrice1, int[][] matrice2) throws RemoteException;
    int[][] transposerMatrice(int[][] matrice) throws RemoteException;
    // Autres méthodes pour d'autres opérations matricielles
}

public interface GestionUtilisateurs extends Remote {
    boolean sIdentifier(String id, String pass) throws RemoteException;
    void ajouterUtilisateur(String id, String pass) throws RemoteException;
}
