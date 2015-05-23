package vote.core.security;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class VoteAuthManager {

	SecurityContext ctx;
	SecurityContextHolder holder;

	public void blah() {
		SecurityContextHolder.getContext().getAuthentication().getPrincipal();

	}
}
