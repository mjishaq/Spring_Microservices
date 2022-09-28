package com.ishaq.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ishaq.microservices.currencyexchangeservice.bean.ExchangeValue;
import com.ishaq.microservices.currencyexchangeservice.bean.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Environment environment;
	
	@Autowired
	ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange-service/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		 //environment.get
				//ExchangeValue exchangeValue= new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
				logger.info("Calling exchange service");
		ExchangeValue exchangeValue=repository.findByFromAndTo(from, to);
				exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
				logger.info("{}",exchangeValue);
				return exchangeValue;
		
	}

}
