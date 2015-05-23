package vote.core.model;

public class Threshold {

	private final double percent;

	public Threshold(final double percent) {
		if (percent < 0.0 || percent > 1.0) {
			throw new IllegalArgumentException("Threshold must be between 0.0 and 1.0 inclusive.");
		}

		this.percent = percent;
	}
}
