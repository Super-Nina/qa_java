import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestsForLion {
    @Mock
    Feline feline;

    @Test
    public void lionGetKittensReturnsOneTest () {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedAmount = 1;
        int actualAmount = lion.getKittens();
        assertEquals("Коичество котят не совпадает", expectedAmount, actualAmount);
    }

    @Test
//    public void doesHaveManeTest(){
      public void lionGetFoodTest() throws Exception{
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualdFood = lion.getFood();
        assertEquals("что-то не так с питанием", expectedFood, actualdFood);
    }
}
