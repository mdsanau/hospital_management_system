//package com.hospital_management.controllers.auth;
//
//import com.hospital_management.configue.UserDetailsServiceImpl;
//import com.hospital_management.dtos.AuthRequest;
//import com.hospital_management.utils.JwtUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private UserDetailsServiceImpl userDetailsService;
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody AuthRequest authRequest) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword())
//        );
//
//        UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getEmail());
//        String jwt = jwtUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(jwt);
//    }
//}
