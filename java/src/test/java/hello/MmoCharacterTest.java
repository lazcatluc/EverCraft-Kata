package hello;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MmoCharacterTest {
    @Test
    public void canSetName() throws Exception {
        MmoCharacter character = characterWithName("me");

        assertThat(character.getName()).isEqualTo("me");
    }

    private MmoCharacter characterWithName(String name) {
        MmoCharacter character = new MmoCharacter();
        character.setName(name);
        return character;
    }

    @Test
    public void iAmDifferentFromYou() throws Exception {
        MmoCharacter me = characterWithName("me");

        MmoCharacter you = characterWithName("you");

        assertThat(me).isNotEqualTo(you);
    }

    @Test
    public void iAmMe() throws Exception {
        MmoCharacter me = characterWithName("me");

        MmoCharacter alsoMe = characterWithName("me");

        assertThat(me).isEqualTo(alsoMe);
    }
}
