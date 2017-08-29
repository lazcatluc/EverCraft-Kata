package hello;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharacterTest {
    @Test
    public void canSetName() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setName("me");

        assertThat(character.getName()).isEqualTo("me");
    }
}
