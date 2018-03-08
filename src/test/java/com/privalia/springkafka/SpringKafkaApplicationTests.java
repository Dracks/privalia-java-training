package com.privalia.springkafka;

import com.privalia.springkafka.consumer.Receiver;
import com.privalia.springkafka.producer.Sender;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.kafka.test.utils.ContainerTestUtils;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringKafkaApplicationTests {

	protected final static String HELLOWORLD_TOPIC = "helloworld.t";

	@Autowired
	private KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;

	@Autowired
	private Receiver receiver;

	@Autowired
	private Sender sender;

	@ClassRule
	public static KafkaEmbedded kafkaEmbedded = new KafkaEmbedded(1, true, HELLOWORLD_TOPIC);

	@Before
	public void runBeforeTestMethod() throws Exception{
		for (MessageListenerContainer messageListenerContainer: kafkaListenerEndpointRegistry.getListenerContainers()){
			ContainerTestUtils.waitForAssignment(messageListenerContainer, kafkaEmbedded.getPartitionsPerTopic());
		}
	}

	@Test
	public void testReceive() throws Exception{
		String text = "Hello Spring Kafka!" + Math.random();
		sender.send(HELLOWORLD_TOPIC, text);

		receiver.getLatch().await(10, TimeUnit.SECONDS);
		assertThat(receiver.getLatch().getCount()).isEqualTo(0);
		assertTrue(receiver.getReceiveMessagesList().size() == 1);
		assertEquals(text, receiver.getReceiveMessagesList().get(0));
	}
}
