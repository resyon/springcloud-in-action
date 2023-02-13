package io.github.resyon.question;

import io.github.resyon.question.entity.TypeEntity;
import io.github.resyon.question.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class QuestionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    TypeService typeService;

    @Test
    void testCreateType(){
        TypeEntity entity = new TypeEntity();
        entity.setTypeName("basic_for_test");
        typeService.save(entity);
        log.info("-------------SUCCESS TO CREATE-----------");
    }

}
