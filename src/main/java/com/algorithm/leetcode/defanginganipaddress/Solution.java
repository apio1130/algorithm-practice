package com.algorithm.leetcode.defanginganipaddress;

/**
 *  1108. Defanging an IP Address
 */
class Solution {
    public String defangIPaddr(String address) {
        // 내부적으로 StringBuilder 로 replase 작업
        return address.replace(".", "[.]");
    }
}