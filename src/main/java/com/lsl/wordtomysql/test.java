package com.lsl.wordtomysql;

import com.lsl.wordtomysql.until.TextContent;

import java.io.File;

public class test {
    public static void main(String[] args) {
        String BASE_PATH = "D:\\demo2\\zh";
        //String BASE_PATH = "D:\\demo2";
        File file = new File(BASE_PATH);
        TextContent.func(file);
    }
}
