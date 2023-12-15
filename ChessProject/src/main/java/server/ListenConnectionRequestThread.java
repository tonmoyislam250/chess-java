
package server;

import java.io.IOException;
import java.net.Socket;


public class ListenConnectionRequestThread extends Thread {

    private final Server server;

    public ListenConnectionRequestThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        while (!this.server.socket.isClosed()) {
            try {
                Socket nSocket = this.server.socket.accept();
                SClient nClient = new SClient(nSocket);
                nClient.Listen();
                Server.clients.add(nClient);
                
            } catch (IOException ex) {
                System.out.println("There is an error occurred when the new client being accepted.");
            }
        }
    }
}
