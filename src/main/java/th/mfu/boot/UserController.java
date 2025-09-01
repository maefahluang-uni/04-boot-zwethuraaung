package th.mfu.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public static Map<String, User> users = new HashMap<String, User>();
 
    
    @PostMapping("/users")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
      //TODO
      if(users.get(user.getUsername()) != null){
        return new ResponseEntity<String>("Username already exists", HttpStatus.CONFLICT);
      }
      users.put(user.getUsername(), user);
      return new ResponseEntity<String>("User registered successfully", HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<Collection<User>> list() {
        //TODO
        if(users.isEmpty()){
            return new ResponseEntity<Collection<User>>(HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<Collection<User>>(users.values(), HttpStatus.OK);
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        //TODO
        if(users.get(username) == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        
        User user = users.get(username);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    
}
