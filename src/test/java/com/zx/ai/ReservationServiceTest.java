package com.zx.ai;

import com.zx.ai.entity.Reservation;
import com.zx.ai.service.ReservationService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class ReservationServiceTest {

    @Resource
    private ReservationService reservationService;

    @Test
    void testInsertReservation() {
        Reservation reservation = new Reservation(null, "张三", "男", "13800000000", LocalDateTime.now(), "北京", 580);
        reservationService.addReservation(reservation);
    }

}
