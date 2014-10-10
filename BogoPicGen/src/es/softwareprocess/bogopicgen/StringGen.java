package es.softwareprocess.bogopicgen;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class StringGen {
	//this piece of code comes from: http://stackoverflow.com/questions/41107/how-to-generate-a-random-alpha-numeric-string
    private static SecureRandom random = new SecureRandom();

    public String randomString() {
        return new BigInteger(130, random).toString(32);
    }
}
