package pl.pjatk.adaguz.lab3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.adaguz.car.Car;

@RestController
@RequestMapping("/test")
public class Lab3 {

    @GetMapping(value = "/hello")
    ResponseEntity<String> sayHello() {
//        return new ResponseEntity<>("Hello world", HttpStatus.OK);
//        return ResponseEntity.status(HttpStatus.OK).body("Hello world");
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping(value = "/hello/{id}")
    public ResponseEntity<String> getSomething(@PathVariable String id) {
        return ResponseEntity.ok(id);
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        Car skoda = new Car("Skoda");
        return ResponseEntity.ok(skoda);
    }

    @GetMapping("/hello/abc")
    public ResponseEntity<String> getRequestParam(@RequestParam String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<String> post(){
        return new ResponseEntity<>("Response text", HttpStatus.OK);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }

}
