package com.vam.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
	@Autowired
	private MemberMapper membermapper;
	
	
	/*
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setMemberId("test");
		member.setMemberPw("test");			
		member.setMemberName("test");		
		member.setMemberMail("test");		
		member.setMemberAddr1("test");		
		member.setMemberAddr2("test");		
		member.setMemberAddr3("test");
		
		membermapper.memberJoin(member);
		
	}
	
	*/
	/*
	@Test
	public void memberIdCheck() throws Exception{
		String id ="admin";
		String id2="test123";
		membermapper.idCheck(id);
		membermapper.idCheck(id2);
		
	}*/
	
	  @Test
	    public void memberLogin() throws Exception{
	        
	        MemberVO member = new MemberVO();    // MemberVO 변수 선언 및 초기화
	        
	        /* 올바른 아이디 비번 입력경우 */
	        member.setMemberId("admin");
	        member.setMemberPw("admin");
	        
	        /* 올바른 않은 아이디 비번 입력경우 */
	        //member.setMemberId("test1123");
	        //member.setMemberPw("test1321321");
	        
	        membermapper.memberLogin(member);
	        System.out.println("결과 값 : " + membermapper.memberLogin(member));
	        
	    }
}
