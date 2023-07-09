package com.lykj.rental.portal.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * 会员商品浏览历史记录
 *  2018/8/3.
 */
@Getter
@Setter
//@Document
public class MemberReadHistory {
    @Id
    private String id;
//    @Indexed
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
//    @Indexed
    private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
