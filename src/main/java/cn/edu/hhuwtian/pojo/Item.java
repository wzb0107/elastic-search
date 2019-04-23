package cn.edu.hhuwtian.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wangzibeng
 * Date: 2019/4/18 0018
 * Time: 8:49
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    /**
     * 可以认为是主键，将来判断数据是否重复的标示，不分词，
     * 可以使用keyword类型
     */
    private Long id;
    /**
     * 标题
     * 搜索字段，需要分词，可以用text类型
     */
    private String title;
    /**
     * 分类
     * <p>
     * 商品分类，这个是整体，不分词，可以使用keyword类型
     */

    private String category;
    /**
     * 品牌
     * 与分类类似，不分词，可以使用keyword类型
     */
    private String brand;

    /**
     * 价格
     * 价格，这个是double类型
     */

    private Double price;
    /**
     * 图片地址
     * 图片，用来展示的字段，不搜索，index为false，不分词，可以使用keyword类型
     */
    private String images;


}
