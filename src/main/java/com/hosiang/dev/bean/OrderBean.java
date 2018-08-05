package com.hosiang.dev.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Blog：http://www.hosiang.cn
 * 订单信息表
 * @author Howe Hsiang
 *
 */
@Entity
@Table(name = "goods_order")
public class OrderBean {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", length = 50)
	public String id;

	@Column(name = "asin", length = 100)
	public String asin;

	@Column(name = "item_status", length = 100)
	public String itemStatus;

	@Column(name = "quantity")
	public Integer quantity;

	@Column(name = "currency", length = 100)
	public String currency;

	@Column(name = "item_price", length = 100)
	public Double itemrice;

	@Column(name = "item_tax", length = 100)
	public Double itemTax;



	@Column(name = "shipping_price", length = 100)
	public Double shippingPrice;

	@Column(name = "shipping_tax", length = 100)
	public String shippingTax;

	@Column(name = "gift_wrap_price", length = 100)
	public String giftWrapPrice;

	@Column(name = "gift_wrap_tax", length = 100)
	public String giftWrapTax;

	@Column(name = "item_promotion_discount", length = 100)
	public Double itemPromotionDiscount;

	@Column(name = "ship_promotion_discount", length = 100)
	public Double shipPromotionDiscount;

	@Column(name = "ship_city", length = 100)
	public String shipCity;

	@Column(name = "ship_state", length = 100)
	public String shipState;


	@Column(name = "ship_postal_code", length = 100)
	public String shipPostalCode;

	@Column(name = "ship_country", length = 100)
	public String shipCountry;

	@Column(name = "promotion_ids", length = 100)
	public String promotionIds;

	@Column(name = "is_business_order", length = 100)
	public String isBusinessrder;

	@Column(name = "purchase_order_number", length = 100)
	public String purchaseOrderNumber;

	@Column(name = "price_designation", length = 100)
	public String priceDesignation;

	//创建人编码
	@Column(name = "create_code", length = 100)
	public String createCode;

	//创建人名称
	@Column(name = "create_name", length = 100)
	public String createName;

	//创建时间
	@Temporal(TemporalType.DATE)
	@Column(name = "create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date createTime;

	//修改人编码
	@Column(name = "update_code", length = 100)
	public String updateCode;

	//修改人名称
	@Column(name = "update_name", length = 100)
	public String updateName;

	//修改时间
	@Temporal(TemporalType.DATE)
	@Column(name = "update_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date updateTime;

	//作废标识
	@Column(name = "yn")
	public Integer yn;

	/**
	 * 省略 get set
	 */
}
