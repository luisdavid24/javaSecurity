package authentication.demoSecurity.Auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

      

    @PostMapping(value="login")
    public ResponseEntity<AuthoReponse> login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(new AuthoReponse());
    }

    @PostMapping(value="register")
    public ResponseEntity<AuthoReponse> register(@RequestBody LoginRequest request){
        return ResponseEntity.ok(new AuthoReponse());
    }
}
