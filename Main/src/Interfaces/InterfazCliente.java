/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author crisb
 */
public interface InterfazCliente extends Remote  {
   void recibirMS (String mensaje) throws RemoteException ;
   
}
