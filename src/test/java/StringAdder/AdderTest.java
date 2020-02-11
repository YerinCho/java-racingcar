package StringAdder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AdderTest {
    private Adder adder = new Adder();
    @Test
    public void splitAndSum_숫자하나() throws Exception {
        int result = adder.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void 아무것도_안들어갔을_떄() throws Exception {
        int result = adder.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void 숫자를_2개이상_입력() throws Exception {
        int result = adder.splitAndSum("1,3");
        assertThat(result).isEqualTo(4);

        result = adder.splitAndSum("1,3,6");
        assertThat(result).isEqualTo(10);
    }


}