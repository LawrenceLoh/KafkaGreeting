package com.daimler.kstream

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel


interface GreetingsStreams {
    @Input(INPUT)
    fun inboundGreetings(): SubscribableChannel

    @Output(OUTPUT)
    fun outboundGreetings(): MessageChannel

    companion object {
        const val INPUT = "greetings-in"
        const val OUTPUT = "greetings-out"
    }
}
