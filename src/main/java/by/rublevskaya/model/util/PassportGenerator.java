package main.java.by.rublevskaya.model.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PassportGenerator {

    public static Set<String> generatePassportNumbers() {
        Set<String> passports = new HashSet<>();
        Random rand = new Random();
        while (passports.size() < 16) {
            StringBuilder sb = new StringBuilder("MP"); //загуглила, как сделать изменяемую строку. Класс StringBuilder для этого.
            // Но как сделать вариативность МР/КН и тд. - не поняла
            for (int i = 0; i < 7; i++) {
                sb.append(rand.nextInt(10));
            }
            passports.add(sb.toString());
        }
        return passports;
    }
}
