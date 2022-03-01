package com.zzx.releasedemo.service;

import com.zzx.releasedemo.domain.Room;
import com.zzx.releasedemo.vo.OwnerRoomNumVO;

import java.util.List;

/**
 * description: RoomService
 * date: 2022/3/1 14:36:13
 * author: zzx
 */
public interface RoomService {

    /**
     * 获取大于某面积的各个拥有者的列表
     * @param roomArea
     * @return
     */
    List<OwnerRoomNumVO> findRoomByRoomAreaGroupByRoomOwner(Double roomArea);

    /**
     * save
     * @param room
     */
    void addEntity(List<Room> room);
}
