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

    @Test
    public void iAmDifferentFromYou() throws Exception {
        MmoCharacter me = new MmoCharacter();
        me.setName("me");

        MmoCharacter you = new MmoCharacter();
        you.setName("you");

        assertThat(me).isNotEqualTo(you);
    }

    @Test
    public void iAmMe() throws Exception {
        MmoCharacter me = new MmoCharacter();
        me.setName("me");

        MmoCharacter alsoMe = new MmoCharacter();
        alsoMe.setName("me");

        assertThat(me).isEqualTo(alsoMe);
    }
}
