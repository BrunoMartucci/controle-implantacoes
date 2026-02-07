package com.implantacao.controleimplantacoes.controller;

//mport security.JwtService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

//    private final AuthenticationManager authenticationManager;
//    private final JwtService jwtService;
//
//    public AuthController(AuthenticationManager authenticationManager,
//                          JwtService jwtService) {
//        this.authenticationManager = authenticationManager;
//        this.jwtService = jwtService;
//    }
//
//    @PostMapping("/login")
//    public LoginResponse login(@RequestBody LoginRequest request) {
//
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.email(),
//                        request.senha()
//                )
//        );
//
//        String token = jwtService.gerarToken(authentication.getName());
//
//        return new LoginResponse(token);
//    }
}
