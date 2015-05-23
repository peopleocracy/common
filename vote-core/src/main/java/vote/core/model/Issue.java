package vote.core.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Issue {

	private final long id;
	private final String name;
	private final List<Referendum> votePeriods;
	private final Set<Option> voteOptions;

	public Issue(final long id, final String name) {
		this.id = id;
		this.name = name;
		this.votePeriods = new LinkedList<>();
		this.voteOptions = new HashSet<>();
	}
}
