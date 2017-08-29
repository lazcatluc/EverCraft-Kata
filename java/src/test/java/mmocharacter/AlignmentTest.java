package mmocharacter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlignmentTest {
    @Test
    public void canSetAlignment() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setAlignment(Alignment.GOOD);

        assertThat(character.getAlignment()).isEqualTo(Alignment.GOOD);
    }
}
