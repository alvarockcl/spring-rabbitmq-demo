package cl.fuentes.mq;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);
	
	public void receiveMessage(String message) {
        System.out.println("El mensaje recibido es: " + message + "");
        latch.countDown();
	}
	
	public CountDownLatch getLatch() {
	        return latch;
	}
}
