package mmocharacter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlignmentTest {
    @Test
    public void canBecomeGood() throws Exception {
        assertCanBecome(Alignment.GOOD);
    }

    @Test
    public void canBecomeNeutral() throws Exception {
        assertCanBecome(Alignment.NEUTRAL);
    }

    @Test
    public void canBecomeEvil() throws Exception {
        assertCanBecome(Alignment.EVIL);
    }

    private void assertCanBecome(Alignment alignment) {
        MmoCharacter character = new MmoCharacter();
        character.setAlignment(alignment);

        assertThat(character.getAlignment()).isEqualTo(alignment);
    }
}
