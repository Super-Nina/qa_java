import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParamTest {
    String sex;

    public LionParamTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Пол животного - {0}")
    public static Object[][] setSex() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
                {"Неизвестно кто"}
        };
    }

    @Test
    public void lionHasManeParamTest() throws Exception {
        try {
            Lion lion = new Lion(sex);
            boolean expected = "Самец".equals(sex);  // Ожидаем true для "Самец" и false для "Самка"
            boolean actualMane = lion.doesHaveMane();
            assertEquals(expected, actualMane);
        } catch (Exception e) {
            System.out.println("Недопустимое значение пола: " + sex);
            fail("Недопустимое значение пола: " + sex);
        }
    }
    }

