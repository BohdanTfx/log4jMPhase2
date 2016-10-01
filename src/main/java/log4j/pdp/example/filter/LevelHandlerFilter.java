package log4j.pdp.example.filter;

import org.apache.log4j.Level;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class LevelHandlerFilter extends Filter {
	private Level level;

	@Override
	public int decide(LoggingEvent event) {
		if (!event.getLevel().equals(level)) {
			return DENY;
		}
		return NEUTRAL;
	}

	public String getLevel() {
		return level.toString();
	}

	public void setLevel(String level) {
		this.level = Level.toLevel(level);
	}
}
