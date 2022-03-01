package com.zzx.releasedemo.dao;

import com.zzx.releasedemo.domain.Room;
import com.zzx.releasedemo.vo.OwnerRoomNumVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * description: RoomDao
 * date: 2022/3/1 14:24:01
 * @author GDDST
 */
@Repository
public interface RoomDao extends JpaRepository<Room,Long>, Serializable {


    /**
     * 获得每个人面积大于？的房间数
     * @param roomArea
     * @return
     */
    @Query("select new com.zzx.releasedemo.vo.OwnerRoomNumVO(r.roomOwner , count (r)) " +
            "from Room r " +
            "where 1=1 and r.roomArea >= :roomArea " +
            "group by r.roomOwner")
    List<OwnerRoomNumVO> findRoomByRoomAreaGroupByRoomOwner(@Param("roomArea") Double roomArea);
}
