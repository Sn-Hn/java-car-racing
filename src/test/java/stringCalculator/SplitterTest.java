package stringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitterTest {

    private Splitter splitter = new Splitter();

    @Test
    @DisplayName("연산자가 잘 분리되는지 테스트")
    void split() {
        assertThat(Arrays.asList("2", "*", "3")).contains(splitter.split("2 * 3"));
    }
}
