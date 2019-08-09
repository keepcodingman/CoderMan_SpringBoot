package com.zhangyu.coderman.myenums;

public enum  CommentNotificationType {

    COMMENT_QUESTION(1,"评论你发表的问题"),
    COMMENT_Like(3,"点赞了你的评论"),
    COMMENT_REPLY(2,"回复了你的评论"),
    LIKE_QUESTION(4,"点赞了问题");

    private String name;
    private Integer code;

    CommentNotificationType(Integer code,String name) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
