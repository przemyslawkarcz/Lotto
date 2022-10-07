package Lotto.Inspect;

public class ExceptionChecksRange extends Exception {

    String friendlyMessage;

    public ExceptionChecksRange(String friendlyMessage) {

        this.friendlyMessage = friendlyMessage;

        System.out.println("The entered data '" + friendlyMessage + "' is out of 1 to 49 range.");
        System.out.println("The game has been stopped! To play restart game :)");

    }

    public String getFriendlyMessage() {
        return friendlyMessage;
    }

}
