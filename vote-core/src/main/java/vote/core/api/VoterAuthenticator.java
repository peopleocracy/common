package vote.core.api;

import vote.core.model.Voter;

public interface VoterAuthenticator {

	public Voter authenticate(String userName, String password);
}
