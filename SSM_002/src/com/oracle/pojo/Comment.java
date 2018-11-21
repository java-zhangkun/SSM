package com.oracle.pojo;

import java.io.Serializable;

public class Comment implements Serializable {
    private Integer commentId;

    private String content;

    private Integer commentUser;

    private Integer commentGoods;

    private static final long serialVersionUID = 1L;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(Integer commentUser) {
        this.commentUser = commentUser;
    }

    public Integer getCommentGoods() {
        return commentGoods;
    }

    public void setCommentGoods(Integer commentGoods) {
        this.commentGoods = commentGoods;
    }
}