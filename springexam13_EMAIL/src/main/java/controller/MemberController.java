package controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.MailSendService;
import spring.MemberService;
import spring.MemberVO;

@Controller
public class MemberController {
	
	private static final HashMap String = null;
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	private MailSendService mailSendService;
	
	public void setMailSendService(MailSendService mailSendService) {
		this.mailSendService=mailSendService;
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String getInsert(@ModelAttribute("member")MemberVO member) {
		return "/member_register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String insert(@ModelAttribute("member")MemberVO member) {
		try {
			memberService.insert(member);
			
			//임의의 authKey생성&이메일 발송
			String authkey=mailSendService.sendAuthMail(member.getEmail());
			member.setAuthkey(authkey);


	        HashMap<java.lang.String, java.lang.String> map = new HashMap<String, String>();
	        map.put("email", member.getEmail());
	        map.put("authkey", member.getAuthkey());
	        System.out.println(map);

	      //DB에 authKey 업데이트
	      memberService.updateKey(map);
			
			return "/member_check";
		}catch(Exception e) {
			e.printStackTrace();
			return "/member_register";
		}
	}
	
	@RequestMapping("/confirm")
	public String confirm(@ModelAttribute("member")MemberVO member) {
		member.setAuthstatus('y');
		memberService.updateStatus(member);
		return "/member_confirm";
	}
}
