package Lotto.Inspect;

public class ExceptionChecksIntegerFormat extends Exception{

    String friendlyMessage;

    public ExceptionChecksIntegerFormat(String friendlyMessage) {

        this.friendlyMessage = friendlyMessage;

        System.out.println("The entered data '" + friendlyMessage + "' is not an integer.");
        System.out.println("The game has been stopped! To play restart game :)");
        System.exit(0);

    }

    public String getFriendlyMessage() {
        return friendlyMessage;
    }

}
