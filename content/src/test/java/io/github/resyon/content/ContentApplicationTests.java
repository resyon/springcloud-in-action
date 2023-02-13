package io.github.resyon.content;

import io.github.resyon.content.entity.NewEntity;
import io.github.resyon.content.service.NewService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContentApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private NewService newService;

	@Test
	void testSave(){
		NewEntity n = new NewEntity();
		n.setTitle("test_record");
		newService.save(n);
	}
}
