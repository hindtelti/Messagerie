package com.ensa.rmi.serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.ensa.rmi.client.ChatClientIF;

public interface ChatServerIF extends Remote{
	void registerChatClient(ChatClientIF chatClient) throws RemoteException;
	void broadcastMessage(String message) throws RemoteException;
}
