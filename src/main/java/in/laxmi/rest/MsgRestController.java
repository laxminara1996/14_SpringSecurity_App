package in.laxmi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	 @GetMapping("/logincheck")
		public String login() {
			return "login page";
		}
    @GetMapping("/hi")
	public String getHi() {
		return "hi , hello";
	}
    @GetMapping("/hello")
	public String getHello() {
		return "hi , hello";
	}
    @GetMapping("/contact")
   	public String contact() {
   		return "call us +9177376795";
   	}
}
