package _1_learn._1_9_network._1_9_10_json_web_token;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

public class JsonWebTokenExample {
    public static void main(final String[] PARAMETERS) {
        // Generate a secret key
        final Key SECRET_KEY = Jwts
                .SIG
                .HS256
                .key()
                .build();

        // Create a JWT token
        final String JSON_WEB_TOKEN_TEXT = Jwts.builder()
                .subject("Command")
                .issuer("User-ID")
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 3600000)) // Set expiration (1 hour)
                .claim(
                        "role",
                        "admin"
                )   // Add custom claims
                .signWith(SECRET_KEY)      // Sign the token with the secret key
                .compact();

        System.out.println("Secret Key: " + JSON_WEB_TOKEN_TEXT);

        // Print parse the JWT token
        printParseJWTToken(
                SECRET_KEY,
                JSON_WEB_TOKEN_TEXT
        );
    }

    private static void printParseJWTToken(
            final Key SECRET_KEY,
            final String JSON_WEB_TOKEN_TEXT
    ) {
        // Get the claims
        final Claims CLAIMS = Jwts.parser()
                .verifyWith((SecretKey) SECRET_KEY)
                .build()
                .parseSignedClaims(JSON_WEB_TOKEN_TEXT)
                .getPayload();
        System.out.printf("""
                        Subject: %s
                        Issuer: %s
                        Issued At: %s
                        Expiration: %s
                        Role: %s""",
                CLAIMS.getSubject(),
                CLAIMS.getIssuer(),
                CLAIMS.getIssuedAt(),
                CLAIMS.getExpiration(),
                CLAIMS.get("role")
        );
    }
}