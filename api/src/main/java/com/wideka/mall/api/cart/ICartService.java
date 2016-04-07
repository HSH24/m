package com.wideka.mall.api.cart;

import java.util.List;

import com.wideka.mall.api.cart.bo.Cart;
import com.wideka.mall.framework.bo.BooleanResult;

/**
 * 
 * @author JiakunXu
 * 
 */
public interface ICartService {

	String STATE_FINISH = "E";

	String STATE_REMOVE = "D";

	/**
	 * 
	 * @param userId
	 * @param shopId
	 * @param itemId
	 * @param skuId
	 * @param quantity
	 * @return
	 */
	BooleanResult createCart(String userId, Long shopId, String itemId, String skuId, String quantity);

	/**
	 * 
	 * @param userId
	 * @param shopId
	 * @return
	 */
	int getCartCount(String userId, Long shopId);

	/**
	 * 获取用户购物车.
	 * 
	 * @param userId
	 * @param shopId
	 * @return
	 */
	List<Cart> getCartList(String userId, Long shopId);

	/**
	 * 移除购物车.
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @return
	 */
	BooleanResult removeCart(String userId, Long shopId, String[] cartId);

	/**
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @param quantity
	 * @return
	 */
	BooleanResult updateQuantity(String userId, Long shopId, String cartId, String quantity);

	/**
	 * 统计商品总金额 运费.
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @return
	 */
	Cart getCartStats(String userId, Long shopId, String[] cartId);

	/**
	 * 根据购物车完成订单.
	 * 
	 * @param userId
	 * @param shopId
	 * @param cartId
	 * @return
	 */
	BooleanResult finishCart(String userId, Long shopId, String[] cartId);

}
