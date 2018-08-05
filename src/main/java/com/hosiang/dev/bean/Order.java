package com.hosiang.dev.bean;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Blog：http://www.hosiang.cn
 *
 * @author Howe Hsiang
 *
 */
@Entity
@Table(name = "t_order")
public class Order {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", length = 36)
	public String id;

	@Column(name = "order_no", length = 50)
	public String no;

	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	public Date date;

	@Column(name = "quantity")
	public int quantity;

	/**
	 * 省略 get set
	 */
}
