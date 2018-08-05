package com.hosiang.dev.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Blog：http://www.hosiang.cn
 *  产品信息表
 * @author Howe Hsiang
 *
 */
@Entity
@Table(name = "goods_product")
public class ProductBean {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", length = 50)
	public String id;

	//日期
	@Temporal(TemporalType.DATE)
	@Column(name = "product_date")
	public Date productDate;

	//品牌
	@Column(name = "product_brand", length = 100)
	public String productBrand;

	//产品图片
	@Column(name = "product_picture", length = 100)
	public String productPicture;

	//产品货号
	@Column(name = "product_number", length = 100)
	public String productNumber;

	//产品名称
	@Column(name = "product_name", length = 100)
	public String productName;

	//ASIN
	@Column(name = "asin", length = 100)
	public String asin;

	//正常售价USD
	@Column(name = "normal_price")
	public Double normalPrice;

	//正常订单数量
	@Column(name = "normal_quantity")
	public Integer normalQuantity;

	//秒杀售价USD
	@Column(name = "seckill_price")
	public Double seckillPrice;

	//秒杀订单数量
	@Column(name = "seckill_quantity", length = 100)
	public Integer seckillQuantity;

	//优惠券 售价
	@Column(name = "coupon_price", length = 100)
	public Double couponPrice;

	//优惠券 订单
	@Column(name = "coupon_quantity", length = 100)
	public Integer couponQuantity;

	//秒杀+优惠券 售价
	@Column(name = "killcoup_price", length = 100)
	public Double killcoupPrice;

	//秒杀+优惠券 订单
	@Column(name = "killcoup_quantity", length = 100)
	public Integer killcoupQuantity;

	//买A再买B - 1 售价
	@Column(name = "buyabone_price", length = 100)
	public Double buyabonePrice;

	//买A再买B - 1 订单数
	@Column(name = "buyabone_quantity", length = 100)
	public Integer buyaboneQuantity;

	//买A再买B - 2 售价
	@Column(name = "buyabtwo_price", length = 100)
	public Double buyabtwoPrice;

	//买A再买B - 2 订单数
	@Column(name = "buyabtwo_quantity", length = 100)
	public Integer buyabtwoQuantity;

	//买A再买B - 3 售价
	@Column(name = "buyabthree_price", length = 100)
	public Double buyabthreePrice;

	//买A再买B - 3 订单数
	@Column(name = "buyabthree_quantity", length = 100)
	public Integer buyabthreeQuantity;

	//订单总数
	@Column(name = "orders_total", length = 100)
	public Integer ordersTotal;

	//原价总额
	@Column(name = "original_sum", length = 100)
	public Double originalSum;

	//优惠总额（手填）
	@Column(name = "discount_sum", length = 100)
	public Double discountSum;

	//差额
	@Column(name = "difference_amount", length = 100)
	public Double differenceAmount;

	//营业额
	@Column(name = "business_amount", length = 100)
	public Double businessAmount;

	//汇率（按当月汇率平均值）
	@Column(name = "exchange_rate", length = 100)
	public Double exchangeRate;

	//亚马逊 佣金(个别类目不同)
	@Column(name = "amazon_commission", length = 100)
	public Double amazonCommission;

	//FBA 费用 USD
	@Column(name = "FBA_cost", length = 100)
	public Double FBACost;

	//初步营业额 RMB
	@Column(name = "initial_turnover", length = 100)
	public Double initialTurnover;

	//活动费用（秒杀）USD
	@Column(name = "activity_cost", length = 100)
	public Double activityCost;

	//运营开支（站外推广，测评，刷单） USD
	@Column(name = "operation_costs", length = 100)
	public Double operationCosts;

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
