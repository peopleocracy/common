package vote.core.model;

public class Voter extends User {

	private final String voterId;

	public Voter(final String voterId) {
		this.voterId = voterId;
	}

	public String getVoterId() {
		return voterId;
	}
}
