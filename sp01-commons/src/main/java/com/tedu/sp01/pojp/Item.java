package com.tedu.sp01.pojp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id; //商品
	private String name; //商品名称
	private Integer number; //商品

}
