package vote.app.sample;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	private static final Logger logger = LogManager.getLogger(SampleController.class);

	@RequestMapping("/")
	public String index() {
		logger.info("Bork bork bork.");
		return "HIYOOOOOOOOOOOOOOOOOOOOOOOO!!!!";
	}
}
