import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    @BeforeAll
    static void beforeAll () {
        System.out.println("Hello!");
    }

    @Test
    public void junitQuiz3(){
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4(){
        System.out.println("This is second test");
    }

    @AfterAll
    static void AfterAll () {
        System.out.println("Bye!");
    }
}
