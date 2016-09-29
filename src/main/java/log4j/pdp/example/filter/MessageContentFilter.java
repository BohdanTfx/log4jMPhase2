package log4j.pdp.example.filter;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class MessageContentFilter extends Filter {
    private static final String INCORRECT_CONTENT = "Incorrect content";

    public int decide(final LoggingEvent event) {
        final String message = event.getRenderedMessage();
        if (message.contains(INCORRECT_CONTENT)) {
            return DENY;
        }
        return ACCEPT;
    }
}
