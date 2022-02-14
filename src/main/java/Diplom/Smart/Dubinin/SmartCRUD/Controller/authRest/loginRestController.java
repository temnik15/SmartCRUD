package Diplom.Smart.Dubinin.SmartCRUD.Controller.authRest;

import Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService.UserService;
import Diplom.Smart.Dubinin.SmartCRUD.dto.AuthenticationRequestDto;
import Diplom.Smart.Dubinin.SmartCRUD.jwt.JwtTokenProvider;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class loginRestController {


    private final AuthenticationManager authenticationManager;

    private final JwtTokenProvider jwtTokenProvider;

    private final UserService userService;

    @Autowired
    public loginRestController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @PostMapping("/api/login")
    public ResponseEntity login(@RequestBody AuthenticationRequestDto requestDto) {
        try {
            String mail = requestDto.getMail();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(mail, requestDto.getPassword()));
            User user = userService.getByMail(mail);
            if (user == null) {
                throw new UsernameNotFoundException("User with username: " + mail + " not found");
            }

            String token = jwtTokenProvider.createToken(mail, user.getRole());
            Map<Object, Object> response = new HashMap<>();
            response.put("username", mail);
            response.put("token", token);

            return ResponseEntity.ok(response);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid username or password");
        }
    }
}
