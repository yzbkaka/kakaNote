package com.example.yzbkaka.kakanote.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by yzbkaka on 19-2-14.
 */

public class Note extends LitePalSupport{
    int id;
    String writeContent;

    public void setId(int id) {
        this.id = id;
    }

    public void setWriteContent(String writeContent) {
        this.writeContent = writeContent;
    }

    public int getId() {
        return id;
    }

    public String getWriteContent() {
        return writeContent;
    }
}
