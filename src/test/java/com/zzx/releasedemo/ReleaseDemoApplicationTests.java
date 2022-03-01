package com.zzx.releasedemo;

import com.zzx.releasedemo.domain.Room;
import com.zzx.releasedemo.service.RoomService;
import com.zzx.releasedemo.vo.OwnerRoomNumVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ReleaseDemoApplicationTests {

    @Autowired
    private RoomService roomService;

    @Test
    void contextLoads() {
        Room r1 = new Room(null,44.5,1,"z2",112.5);
        Room r2 = new Room(null,55.5,2,"z1",113.5);
        Room r3 = new Room(null,55.5,3,"z4",114.5);
        Room r4 = new Room(null,44.5,4,"z3",116.5);
        Room r5 = new Room(null,44.5,5,"z6",117.5);
        Room r6 = new Room(null,55.5,6,"z5",118.5);
        Room r7 = new Room(null,44.5,7,"z8",119.5);
        Room r8 = new Room(null,55.5,8,"z7",111.5);
        List<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);
        rooms.add(r5);
        rooms.add(r6);
        rooms.add(r7);
        rooms.add(r8);

        roomService.addEntity(rooms);
    }

    @Test
    void findTest(){
        List<OwnerRoomNumVO> results = roomService.findRoomByRoomAreaGroupByRoomOwner(30.0);
        System.out.println(results);
    }

}
