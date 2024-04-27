import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitQuiz {

    @Test
    public void junitTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        Assertions.assertNotNull(name1);
        Assertions.assertNotNull(name2);
        Assertions.assertNotNull(name3);
        Assertions.assertEquals(name1, name2);
        Assertions.assertNotEquals(name1, name3);
    }

    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        Assertions.assertTrue(number1 > 0);
        Assertions.assertTrue(number2 == 0);
        Assertions.assertTrue(number3 < 0);
        Assertions.assertTrue(number1 > number2);
        Assertions.assertTrue(number3 < number2);
    }
}
