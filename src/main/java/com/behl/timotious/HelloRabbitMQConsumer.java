package com.behl.timotious;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloRabbitMQConsumer {

	@RabbitListener(queues = "course.hello")
	public void listen(String message) {
		System.out.println("Consuming " + message);
	}
}
