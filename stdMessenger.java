package messenger;

public class stdMessenger implements Messenger {

    boolean isSucces;

    @Override
    public void sendMessege(String receiver, String subject, String messege) {

        System.out.println("Receiver            : " + receiver);
        System.out.println("Subject             : " + subject);
        System.out.println("Messege             : " + messege);

        if (receiver == "") {
            isSucces = false;
            System.out.println("Status Messege      : " + messege);
            System.out.println("Std not sent,\n");
        } else {
            isSucces = true;
            System.out.println("Status Messege      : " + messege);
            System.out.println("Std sent,\n");
        }
        // receiver = "Dyland";
        // subject = "Invitation";
        // messege = "I wanna invite you to join my team project, did you want it?";
    }

}
