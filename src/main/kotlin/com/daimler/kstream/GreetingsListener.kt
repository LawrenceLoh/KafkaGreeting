package com.daimler.kstream

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j


@Component
class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    fun handleGreetings(@Payload greetings: Greetings) {
//        log.info("Received greetings: {}", greetings)
        println("Message is received " + greetings.message)
    }
}
