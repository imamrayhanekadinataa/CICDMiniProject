package Utils;

import java.util.Random;

public class General {
    public static String base_url = "https://be-qa.alta.id/api";

        Random rand = new Random();

        public String randomEmail(){
            return "rayhan" + + rand.nextInt(1000) + "@gmail.com";
        }
    }

