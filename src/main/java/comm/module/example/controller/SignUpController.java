package comm.module.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.module.example.dto.SignUpDTO;
import comm.module.example.service.SignUpService;

@Controller
@RequestMapping("")
public class SignUpController {

		@Autowired
	private SignUpService signUpService;
	
	public SignUpController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/action_page.php.do")
	public String onSubmit(SignUpDTO dto, ModelMap map) {
		System.out.println("inviked onSubmit");

		try {
			System.out.println("invoked onSignup");
			boolean check = this.signUpService.validateAndSave(dto);
			if (check) {
				map.addAttribute("name", dto.getUserName());
				map.addAttribute("success", "your data is saved");
			} else {
				map.addAttribute("failure", "Data not saved");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Signup";
	}
}
