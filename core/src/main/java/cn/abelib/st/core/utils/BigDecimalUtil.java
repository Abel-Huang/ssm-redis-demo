package cn.abelib.st.core.utils;

import java.math.BigDecimal;

/**
 *
 * @author abel
 * @date 2018/3/16
 */
public class BigDecimalUtil {
    private BigDecimalUtil(){

    }

    public static BigDecimal add(double v1, double v2){
        BigDecimal b1= new BigDecimal(Double.toString(v1));
        BigDecimal b2= new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }

    public static BigDecimal sub(double v1, double v2){
        BigDecimal b1= new BigDecimal(Double.toString(v1));
        BigDecimal b2= new BigDecimal(Double.toString(v2));
        return b1.subtract(b2);
    }

    public static BigDecimal mul(double v1, double v2){
        BigDecimal b1= new BigDecimal(Double.toString(v1));
        BigDecimal b2= new BigDecimal(Double.toString(v2));
        return b1.multiply(b2);
    }

    public static BigDecimal div(double v1, double v2){
        BigDecimal b1= new BigDecimal(Double.toString(v1));
        BigDecimal b2= new BigDecimal(Double.toString(v2));
        // 四舍五入
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }
}
