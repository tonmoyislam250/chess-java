package server;

public class ClientRemovingControlThread extends Thread{

    private final Server server;

    public ClientRemovingControlThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        
        while(!this.server.socket.isClosed())
        {
            Server.clients.removeIf(client -> client.socket.isClosed());
        }
    }
    
    
}
