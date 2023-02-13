package io.github.resyon.channel;

import io.github.resyon.channel.entity.ChannelEntity;
import io.github.resyon.channel.service.ChannelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChannelApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	ChannelService channelService;

	@Test
	void testSave(){
		ChannelEntity entity = new ChannelEntity();
		entity.setName("Test_Record");
		channelService.save(entity);
	}
}
