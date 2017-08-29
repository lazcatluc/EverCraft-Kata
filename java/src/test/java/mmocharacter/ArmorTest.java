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

    @Test
    public void resistsAttacksWhenDamageLowerThanArmor() throws Exception {
        MmoCharacter defender = new MmoCharacter();
        defender.setArmor(5);
        defender.setHitPoints(5);

        attack(defender, 3);

        assertThat(defender.getHitPoints()).isEqualTo(5);
    }

    @Test
    public void takesDamageWhenHitMoreThanArmorCanStand() throws Exception {
        MmoCharacter defender = new MmoCharacter();
        defender.setArmor(5);
        defender.setHitPoints(5);

        attack(defender, 8);

        assertThat(defender.getHitPoints()).isEqualTo(2);
    }

    private void attack(MmoCharacter defender, int hit) {
        defender.setHitPoints(Math.min(defender.getHitPoints(),
                defender.getHitPoints() + defender.getArmor() - hit));
    }
}
