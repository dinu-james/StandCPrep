package com.dkj.springjwtlearnings.controller;

import com.dkj.springjwtlearnings.model.AuthenticationRequest;
import com.dkj.springjwtlearnings.model.AuthenticationResponse;
import com.dkj.springjwtlearnings.service.UserDetailService;
import com.dkj.springjwtlearnings.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserDetailService userDetailService;
    @Autowired
    JwtUtil jwtUtil;

    @RequestMapping({"/user"})
    public String user()
    {
        return "Hello - User";
    }

    @RequestMapping(value="/authenticate", method= RequestMethod.POST)
    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception
    {

        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
        }catch (BadCredentialsException E){
            throw new Exception("Wrong Credentials",E);
        }
        final UserDetails userDetails = userDetailService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
       
    }



}
