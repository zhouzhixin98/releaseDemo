package com.zzx.releasedemo.vo;

import lombok.*;

import java.io.Serializable;

/**
 * description: OwnerRoomNumVO
 * date: 2022/3/1 14:45:02
 * author: zzx
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OwnerRoomNumVO implements Serializable {

    private String ownner;

    private Long count;
}
