package mmocharacter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HitPointsTest {
    @Test
    public void canSetHitpoints() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setHitPoints(10);

        assertThat(character.getHitPoints()).isEqualTo(10);
    }

    @Test
    public void newCharacterHas5Hitpoints() throws Exception {
        MmoCharacter character = new MmoCharacter();

        assertThat(character.getHitPoints()).isEqualTo(5);
    }
}
