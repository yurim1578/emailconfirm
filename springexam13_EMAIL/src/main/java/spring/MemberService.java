package spring;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class MemberService {

	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO=memberDAO;
	}
	
	public void insert(MemberVO member) {
		memberDAO.insert(member);
	}
	
	public void updateKey(HashMap<String,String> map) {
		memberDAO.updateKey(map);
	}
	
	public void updateStatus(MemberVO member) {
		memberDAO.updateStatus(member);
	}
}
