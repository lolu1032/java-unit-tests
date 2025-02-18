package com.example.demo.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lotto {
    public List<Integer> lotto() {
        List<Integer> list = new ArrayList<>();
        Random rd = new Random();

        while(list.size() < 6) {
            int num = rd.nextInt(45) + 1;
//            if(!list.contains(num)) {
                list.add(num);
//            }
        }
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
