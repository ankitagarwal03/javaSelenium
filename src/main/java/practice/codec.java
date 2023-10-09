package practice;

//import net.bytebuddy.utility.RandomString;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class codec {

    Map<String, String > tinyMap = new HashMap<>();

    public String encode(String longUrl) {

//        net.bytebuddy.utility.RandomString gen = new net.bytebuddy.utility.RandomString(8, ThreadLocalRandom.current());

        Random r= new Random();
        String url = "vw"+r.nextInt(1000000)+"ABC";
        System.out.println("url "+url);

        String tinyUrl = "http://tinyurl.com/"+url;
        tinyMap.put(tinyUrl, longUrl);

        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return tinyMap.getOrDefault(shortUrl, null);
    }
}
