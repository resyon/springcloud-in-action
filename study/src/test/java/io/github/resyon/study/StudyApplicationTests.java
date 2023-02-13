package io.github.resyon.study;

import io.github.resyon.study.entity.ViewLogEntity;
import io.github.resyon.study.service.ViewLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ViewLogService viewLogService;

	@Test
	void testSave(){
		ViewLogEntity entity = new ViewLogEntity();
		entity.setDelFlag(1);
		viewLogService.save(entity);
	}

}
