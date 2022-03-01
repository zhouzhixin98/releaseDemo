package com.zzx.releasedemo.domain;

import lombok.*;

import javax.persistence.*;

/**
 * description: Room
 * date: 2022/3/1 14:26:39
 * author: zzx
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long roomId;

    @Column
    private Double roomArea;

    @Column
    private Integer roomNum;

    @Column
    private String roomOwner;

    @Column
    private Double roomPrice;

}
