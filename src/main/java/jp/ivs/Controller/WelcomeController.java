package jp.ivs.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WelcomeController {
	@RequestMapping("/login")
	public String welcome() {
		return "login";
	}
}
