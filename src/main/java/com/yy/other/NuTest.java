package com.yy.other;

/**
 * 替换描述
 *
 * @ClassName NuTest
 * @Author yangfeng
 * @Date 2025/9/11 15:34
 * @Version 1.0
 */
public class NuTest {
    public static void main(String[] args) {
        StationOptUserInfoDTO dto = new StationOptUserInfoDTO();
        System.out.println(dto.getOptUserPhone());
        dto.setOptUserPhone(dto.getOptUserPhone());
    }
}