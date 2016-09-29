package log4j.pdp.example.filter;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class MessageSizeFilter extends Filter {
    private static final int MAX_MESSAGE_SIZE = 30;

    public int decide(final LoggingEvent event) {
        final String message = event.getRenderedMessage();
        if (message.length() > MAX_MESSAGE_SIZE) {
            return DENY;
        }
        return NEUTRAL;
    }
}
