package io.github.resyon.member;

import io.github.resyon.member.entity.MemberEntity;
import io.github.resyon.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	MemberService memberService;
	@Test
	void testSave(){
		MemberEntity mem = new MemberEntity();
		mem.setUseName("test_record");
		memberService.save(mem);
	}
}
