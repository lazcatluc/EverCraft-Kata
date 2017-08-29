package mmocharacter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmorTest {
    @Test
    public void canSetArmor() throws Exception {
        MmoCharacter character = new MmoCharacter();
        character.setArmor(5);

        assertThat(character.getArmor()).isEqualTo(5);
    }

    @Test
    public void newCharacterHas10Armor() throws Exception {
        MmoCharacter character = new MmoCharacter();

        assertThat(character.getArmor()).isEqualTo(10);
    }
}
