package spring;

import java.util.HashMap;

public interface MemberDAO {

	public void insert(MemberVO member);
	
	public void updateKey(HashMap<String, String> map);
	
	public void updateStatus(MemberVO member);
	
	public MemberVO login(MemberVO member);
	}
