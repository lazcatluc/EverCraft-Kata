package mmocharacter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlignmentTest {
    @Test
    public void canBecomeGood() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setAlignment(Alignment.GOOD);

        assertThat(character.getAlignment()).isEqualTo(Alignment.GOOD);
    }

    @Test
    public void canBecomeNeutral() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setAlignment(Alignment.NEUTRAL);

        assertThat(character.getAlignment()).isEqualTo(Alignment.NEUTRAL);
    }

    @Test
    public void canBecomeEvil() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setAlignment(Alignment.EVIL);

        assertThat(character.getAlignment()).isEqualTo(Alignment.EVIL);
    }
}
