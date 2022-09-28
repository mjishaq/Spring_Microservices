package service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class KafkaConsumerService {
	
	private Logger logger= org.slf4j.LoggerFactory.getLogger(KafkaConsumerService.class);
	
	@KafkaListener(topics = "topic", groupId = "group-id")
	public void consume(String message) {
		
		logger.info(String.format("Message received %s", message));
	}

}
