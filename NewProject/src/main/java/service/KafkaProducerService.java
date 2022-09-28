package service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {

	private Logger logger= org.slf4j.LoggerFactory.getLogger(KafkaProducerService.class);
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMessage(String message) {
		
		logger.info(String.format("Message sent %s", message));
		kafkaTemplate.send("test", message);
		
		
	}
	
	
}
