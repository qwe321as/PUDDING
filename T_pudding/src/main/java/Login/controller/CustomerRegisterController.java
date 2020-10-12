package Login.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Login.model.Customer;
import Login.model.CustomerDao;



@Controller
public class CustomerRegisterController {
	
	final String command = "/registerForm.me";
	final String getPage = "RegisterForm";
	final String gotoPage = "redirect:/loginForm.me"; // MemberListController
	
	@Autowired
	CustomerDao memberDao;
	
	// MemberLoginForm.jsp 
	@RequestMapping(value=command, method=RequestMethod.GET)
		public String doAction() {
			
			return getPage;
		}
		
		//MemberRegisterForm.jsp ���� ��û�� 
		@RequestMapping(value=command, method=RequestMethod.POST) // MemberLoginForm.jsp���� �Ѿ��
		public ModelAndView doAction(@Valid Customer customer, BindingResult result) {
			
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { 
			 mav.setViewName(getPage);
			 return mav;
			 }
		 	
		memberDao.insertData(customer);
		
		mav.setViewName(gotoPage);
		return mav;
	}
	
}
