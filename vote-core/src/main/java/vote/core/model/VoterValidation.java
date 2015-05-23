package vote.core.model;

import java.util.Date;

public abstract class VoterValidation {

	private final Date validationExpiry;

	protected VoterValidation(final Date validationExpiry) {
		this.validationExpiry = validationExpiry;
	}

	public Date getValidationExpiry() {
		return this.validationExpiry;
	}
}
