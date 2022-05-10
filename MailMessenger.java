package messenger;

public class MailMessenger implements Messenger {

    boolean isSucces;
    boolean isConnectedToServer;

    void connect() {
        isConnectedToServer = true;
        System.out.println("Server Connected");
    }

    void disconnect() {
        isConnectedToServer = false;
        System.out.println("Server Disconnected");
    }

    @Override
    public void sendMessege(String receiver, String subject, String messege) {
        System.out.println("Receiver            : " + receiver);
        System.out.println("Subject             : " + subject);
        System.out.println("Messege             : " + messege);
        System.out.println("Connection Status   : " + isConnectedToServer);

        if (isConnectedToServer == true) {
            if (receiver == "") {
                isSucces = false;
                System.out.println("Status Messege      : " + isSucces);
                System.out.println("Mail not sent,\n");
            } else {
                isSucces = true;
                System.out.println("Status Messege      : " + isSucces);
                System.out.println("Mail sent,\n");
            }
        } else {
            System.out.println("Mail not sent, check your network \n");
        }
    }

    // public void connect() {
    // boolean koneksi;
    // if (koneksi == isSucces) {
    // koneksi = isConnectedToServer;
    // } else if (koneksi == isConnectedToServer) {
    // koneksi = isSucces;
    // System.out.println("Koneksi isSucces");
    // } else
    // System.out.println("Koneksi Sudah isSucces");
    // }

    // public void disconnect() {
    // boolean koneksi;
    // if (koneksi == isConnectedToServer) {
    // koneksi = isSucces;
    // } else if (koneksi == isSucces) {
    // koneksi = isConnectedToServer;
    // System.out.println("Koneksi isSucces");
    // } else
    // System.out.println("Koneksi Sudah isSucces");
    // }
}
