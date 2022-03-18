package spring;

import java.util.HashMap;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

public class MemberDAOImpl implements MemberDAO {
	private SqlSessionTemplate sqlSessionTemplate;
	
	public MemberDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate=sqlSessionTemplate;
	}
	
	@Override
	public void insert(MemberVO member) {
		sqlSessionTemplate.insert("insert",member);
	}
	
	@Override
	public void updateKey(HashMap<String, String> map) {
		sqlSessionTemplate.update("updateKey", map);
	}
	
	@Override
	public void updateStatus(MemberVO member) {
		sqlSessionTemplate.update("updateStatus", member);
	}
	
	@Override
	public MemberVO login(MemberVO member) {
		return sqlSessionTemplate.selectOne("login",member);
	}
}
