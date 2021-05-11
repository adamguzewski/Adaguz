package pl.pjatk.adaguz.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.adaguz.user.User;

@RestController
@RequestMapping("/homework")

public class Homework {

    @GetMapping("/users-pathVariable/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        User user = new User(username, 1);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users-requestParam")
    public ResponseEntity<User> getUserRequestParam(@RequestParam String username) {
        User userRequestParam = new User(username, 2);
        return ResponseEntity.ok(userRequestParam);
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser() {
        User user = new User("Adam", 3);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable int id) {
        if(user.getId() == id){
            System.out.println("Username and id updated:");
            user.setId(123);
            user.setUsername("Leonardo");
        }
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        if(id == 200){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>("Wrong id", HttpStatus.OK);
    }

}
