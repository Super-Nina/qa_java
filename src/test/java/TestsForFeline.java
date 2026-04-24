import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestsForFeline {
    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("что-то не так с питанием",expectedFood,actualFood);
    }

    @Test
    public void felineGetFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("зверек не из Кошачьих", expectedFamily,actualFamily);
    }

    @Test
    public void felineGetKittensWithoutArgReturnsOneTest(){
        int expectedAmount = 1;
        int actualAmount = feline.getKittens();
        assertEquals("количество котят отличается", expectedAmount,actualAmount);
    }

    @Test
    public void felineGetKittensWithArgReturnsSameValueTest(){
        int expectedAmount = 5;
        int actualAmount = feline.getKittens(expectedAmount);
        assertEquals("количество котят отличается", expectedAmount,actualAmount);
    }
}
