package com.anup.kafka_provider.controller;

import com.anup.kafka_provider.service.KafkaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
public class ProduceMessageController {

    @Autowired
    private KafkaService kafkaService;


    @GetMapping("/")
    public String getMessage(){
        return "Hello It's working fine";
    }

    @GetMapping("/produce")
    public ResponseEntity<?> produceMessage(@RequestParam("message") String msg){
        kafkaService.produceMessage(msg);
        return new ResponseEntity<>(Map.of("Message", "Updated Successfully"),HttpStatus.OK);
    }
}
