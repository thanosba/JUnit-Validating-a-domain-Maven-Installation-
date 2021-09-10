import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class ThaiDomainTest {

    @Parameter
    public String domainName;

    //Single parameter, use Object[]
    @Parameters(name = "{index}: testDomain - {0}")
    public static Object[] data() {
        return new Object[]{
                "universal-acceptance-test.international",
                "universal-acceptance-test.icu",
                "ยูเอทดสอบ.ไทย",
                "ทีเอชนิค.องค์กร.ไทย",
                "เราไม่ทิ้งกัน.com"
        };
    }

    @Test
    public void test_valid_domain() {
        assertThat(domainConfig.isValid(domainName), is(true));
    }

}

