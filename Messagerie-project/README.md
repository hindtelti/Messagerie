# RMIChat

This is a little program that demonstrates the use of RMI for a chat application.

cd /pathToYourWorkspace/RMIChat/bin

tty1: rmic com.ensa.chat.rmi.serveur.ChatServeur <br>
tty1: rmiregistry

tty2: java com.ensa.chat.rmi.serveur.ChatServerMain <br>

tty3: java com.ensa.chat.rmi.client.ChatClientMain SomeUserName<br>
