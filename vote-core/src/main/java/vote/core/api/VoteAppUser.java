package vote.core.api;

import java.util.Set;

import vote.core.model.VoterValidation;

public interface VoteAppUser {

	public String getVoterId();

	public Set<VoterValidation> getVoterValidations();
}
