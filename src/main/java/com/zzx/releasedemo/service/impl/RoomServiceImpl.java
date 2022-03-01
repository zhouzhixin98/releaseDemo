package com.zzx.releasedemo.service.impl;

import com.zzx.releasedemo.dao.RoomDao;
import com.zzx.releasedemo.domain.Room;
import com.zzx.releasedemo.service.RoomService;
import com.zzx.releasedemo.vo.OwnerRoomNumVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: RoomServiceImpl
 * date: 2022/3/1 14:36:23
 * author: zzx
 */
@Service
public class RoomServiceImpl implements RoomService {

    private RoomDao roomDao;

    public RoomServiceImpl(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public List<OwnerRoomNumVO> findRoomByRoomAreaGroupByRoomOwner(Double roomArea) {
        return roomDao.findRoomByRoomAreaGroupByRoomOwner(roomArea);
    }

    @Override
    public void addEntity(List<Room> rooms) {
        roomDao.saveAll(rooms);
    }


}
