/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Interfaces.InterfazCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;

/**
 *
 * @author crisb
 */
public class ClienteMensaje extends UnicastRemoteObject implements InterfazCliente {
    public JTextArea ViewChat;

    public ClienteMensaje(JTextArea MSChat) throws RemoteException {
        this.ViewChat = MSChat;
    }

    public void recibirMS(String mensaje) throws RemoteException {

        ViewChat.append(mensaje + "\n");
    }
}
