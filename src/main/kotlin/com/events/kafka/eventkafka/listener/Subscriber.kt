package com.events.kafka.eventkafka.listener

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Subscriber {

    private  val log = LoggerFactory.getLogger(Subscriber::class.java)
    @KafkaListener(
            topics = ["receive-event"],
            groupId = "kafka-receive-event-group"
    )
    fun receiveEvent(message:String){
        log.info("Event Received: ${message}")
    }
}