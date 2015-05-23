package vote.core.model;

public class Vote {

	private final Option choice;
	private Voter voter;
	private final Issue issue;

	public Vote(final Issue issue, final Option choice) {
		this.issue = issue;
		this.choice = choice;
	}

}
