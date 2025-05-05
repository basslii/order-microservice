package com.example.messaging_rabbitmq;

import com.example.messaging_rabbitmq.rpc.RpcRequestModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OrderListener {

    @RabbitListener(queues = OrderServiceRabbitConfig.queueName)
    public String findOrderMadeByUser(@Payload RpcRequestModel requestModel) {
        return "Received return value of user with id " + requestModel.getData();
    }
}
