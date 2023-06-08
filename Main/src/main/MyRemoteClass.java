
package main;

import Interfaces.MiInterfazRemota;
import Interfaces.InterfazCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author crisb
 */
public class MyRemoteClass extends UnicastRemoteObject implements MiInterfazRemota{
    private List<InterfazCliente> clients;
    private Set<String> mensajesEnviados;
      
    
    public MyRemoteClass() throws RemoteException {
         clients = new ArrayList<>();
         mensajesEnviados = new HashSet<>();
    }
    
     public void registerClient(InterfazCliente client) throws RemoteException{
        clients.add(client);
    }
     
    public String poolMS(String  aux) throws RemoteException {
   
        return aux;
    }

     public void SendMS(String mensaje) throws RemoteException {
        if (!mensajesEnviados.contains(mensaje)) {
            for (InterfazCliente client : clients) {
                client.recibirMS(mensaje);
            }
            mensajesEnviados.add(mensaje);
        }
    }
}
