package lab.microservice.hello;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverComponent {

    @KafkaListener(topics = "message")
    void listen(Message message){
        System.out.println(message.getText() +" "+message.getDate().toString());
    }

}
