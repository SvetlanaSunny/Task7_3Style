package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticServiceTest {
    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax1() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 6, 8, 1, 5, 3, 22, 6, 8, 10, 2};
        long expected = 22;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
