package th.ac.cdti.rottenpotatoes.domain;

import java.util.Objects;

public record Moviegoer(String name, String email) {

    public Moviegoer {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(email, "email");

        name = name.strip();
        email = email.strip();

        if (name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("email must contain @");
        }
    }
}