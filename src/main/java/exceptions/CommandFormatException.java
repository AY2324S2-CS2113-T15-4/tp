package exceptions;

import parser.CommandType;
import common.Messages;

public class CommandFormatException extends Exception{
    public CommandFormatException(CommandType command){

        switch (command) {

        case ADD:
            System.out.println(Messages.INVALID_ADD_FORMAT);
            break;
        case DEL:
            System.out.println(Messages.INVALID_DELETE_FORMAT);
            break;
        case EDIT:
            System.out.println(Messages.INVALID_EDIT_FORMAT);
            break;
        case SELL:
            System.out.println(Messages.INVALID_SELL_FORMAT);
            break;
        case FIND:
            System.out.println(Messages.INVALID_FIND_FORMAT);
            break;
        case HELP:
            System.out.println(Messages.HELP);
            break;
        case LIST:
            System.out.println(Messages.INVALID_LIST_FORMAT);
            break;
        case MARK:
            System.out.println(Messages.INVALID_MARK_FORMAT);
            break;
        case UNMARK:
            System.out.println(Messages.INVALID_UNMARK_FORMAT);
            break;
        default:
            System.out.println(Messages.INVALID_COMMAND);
            break;
        }

    }

    public CommandFormatException(String error) {
        switch (error) {

        case "SELL_PRICE":
            System.out.println(Messages.INVALID_SELL_PRICE);
            break;
        default:
            System.out.println("Error Detected");
        }



    }
}
