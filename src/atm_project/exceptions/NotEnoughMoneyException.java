package atm_project.exceptions;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(String message) {
        super(message);
    }

}
