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

   
    public ResponseEntity<String> registerUser( User user) {
      //TODO
      return null;
    }

    public ResponseEntity<Collection<User>> list() {
        //TODO
        return null;
    }

    public ResponseEntity<User> getUser(String username) {
        //TODO
        return null;
    }
    
}
