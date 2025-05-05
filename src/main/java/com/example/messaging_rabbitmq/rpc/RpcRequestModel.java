package com.example.messaging_rabbitmq.rpc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RpcRequestModel {
    private String pattern;
    private String data;
    private String id;
}
