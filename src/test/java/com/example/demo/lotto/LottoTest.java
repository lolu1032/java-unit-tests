package com.example.demo.lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LottoTest {
    private final Lotto lottoTest = new Lotto();

    @Test
    void Tests() {
        List<Integer> result = lottoTest.lotto();

        // 로또 번호가 6개이고, 1부터 45 사이의 번호인지 확인
        assertEquals(6, result.size(), "로또 번호는 6개여야 합니다.");
        assertTrue(result.stream().allMatch(number -> number >= 1 && number <= 45), "모든 번호는 1과 45 사이여야 합니다.");
        assertTrue(isSorted(result), "번호는 오름차순으로 정렬되어야 합니다.");
        assertEquals(6, result.stream().distinct().count(), "번호는 중복되지 않아야 합니다.");
    }
    private boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }
}
