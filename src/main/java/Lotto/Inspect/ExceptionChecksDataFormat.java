package Lotto.Inspect;

public class ExceptionChecksDataFormat extends Exception{

    String friendlyMessage;

    public ExceptionChecksDataFormat(String friendlyMessage) {

        this.friendlyMessage = friendlyMessage;

        System.out.println("The entered data '" + friendlyMessage + "' is not an integer.");
        System.out.println("The game has been stopped! To play restart game :)");

    }

    public String getFriendlyMessage() {
        return friendlyMessage;
    }

}
