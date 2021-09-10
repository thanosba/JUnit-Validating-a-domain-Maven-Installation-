import java.util.regex.Pattern;

public class domainConfig {
  private static final String DOMAIN_NAME_PATTERN =
      "^((?!-)[\\u0E00-\\u0E7FA-Za-z0-9-]{1,63}(?<!-)\\.)+[\\u0E00-\\u0E7FA-Za-z]{2,20}$";

    private static Pattern pDomainName = Pattern.compile(DOMAIN_NAME_PATTERN);

    public static boolean isValid(String domainName) {
        return pDomainName.matcher(domainName).find();
    }

}

