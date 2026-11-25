package th.ac.cdti.rottenpotatoes.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class MoviegoerTest {

    @Test
    void keepsNameAndEmail() {
        Moviegoer moviegoer = new Moviegoer("Alice", "alice@example.com");

        assertThat(moviegoer.name()).isEqualTo("Alice");
        assertThat(moviegoer.email()).isEqualTo("alice@example.com");
    }

    @Test
    void rejectsAnEmailWithoutAtSign() {
        assertThatThrownBy(() -> new Moviegoer("Alice", "alice.example.com"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("@");
    }
}