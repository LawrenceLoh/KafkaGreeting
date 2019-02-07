package com.daimler.kstream


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingsController(private val greetingsService: GreetingsService) {
    @GetMapping("/greetings")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun greetings(@RequestParam("message") message: String) {
        val greetings = Greetings(System.currentTimeMillis(),message)
        greetingsService.sendGreeting(greetings)
        println("Controller~~~ received")
    }
}
