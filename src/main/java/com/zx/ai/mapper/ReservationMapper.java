package com.zx.ai.mapper;

import com.zx.ai.entity.Reservation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReservationMapper {
    // 1.添加预约
    @Insert("insert into reservation(name,gender,phone,communication_time,province,estimated_score) values(#{name},#{gender},#{phone},#{communicationTime},#{province},#{estimatedScore})")
    void addReservation(Reservation reservation);

    // 2.根据手机号查询预约
    @Select("select * from reservation where phone = #{phone}")
    Reservation queryReservationByPhone(String phone);
}
