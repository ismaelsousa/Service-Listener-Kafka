package com.events.kafka.eventkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventKafkaApplication

fun main(args: Array<String>) {
    runApplication<EventKafkaApplication>(*args)
}
