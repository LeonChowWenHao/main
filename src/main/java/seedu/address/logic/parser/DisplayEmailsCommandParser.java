package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.logic.commands.DisplayEmailsCommand;
import seedu.address.logic.parser.exceptions.ParseException;

//@@author leonchowwenhao
/**
 * Parses input arguments and creates a new DisplayEmailsCommand object
 */
public class DisplayEmailsCommandParser implements Parser<DisplayEmailsCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the DisplayEmailsCommand
     * and returns an DisplayEmailsCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DisplayEmailsCommand parse(String args) throws ParseException {
        try {
            Index index = ParserUtil.parseIndex(args);
            return new DisplayEmailsCommand(index);
        } catch (IllegalValueException ive) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DisplayEmailsCommand.MESSAGE_USAGE));
        }
    }
}
