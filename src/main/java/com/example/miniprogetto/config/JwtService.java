package com.example.miniprogetto.config;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class JwtService {

    private final static String SECRET_KEY = "7bf7A7TjyC1+zq7SnwxnFVmEZSqX9i8oVhhJvi3ZmP/1uSGkG0kPj6PP/teJkkdN";
    public String extractUsername(String token) {
        return null;
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignedInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSignedInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
