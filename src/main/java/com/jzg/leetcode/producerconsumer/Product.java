package com.jzg.leetcode.producerconsumer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
}
