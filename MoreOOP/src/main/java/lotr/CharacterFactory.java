package lotr;
import java.util.Random;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

public class CharacterFactory{
    @SneakyThrows
    public static Character createCharacter(){
        List<Class<? extends Character >> characters= Arrays.asList(Hobbit.class);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }
}
