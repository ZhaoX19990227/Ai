package com.zx.ai.service;

import com.zx.ai.entity.Reservation;
import com.zx.ai.mapper.ReservationMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Resource
    private ReservationMapper reservationMapper;

    public void addReservation(Reservation reservation) {
        reservationMapper.addReservation(reservation);
    }

    public Reservation queryReservationByPhone(String phone) {
        return reservationMapper.queryReservationByPhone(phone);
    }

}
