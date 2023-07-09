package com.lykj.rental.portal.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
/**
 * 会员品牌关注
 *  2018/8/2.
 */
@Getter
@Setter
//@Document
public class MemberBrandAttention {
    @Id
    private String id;
//    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
//    @Indexed
    private Long brandId;
    private String brandName;
    private String brandLogo;
    private String brandCity;
    private Date createTime;
}
