package com.system.feedback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;
@Entity
public class Response {
    @Id
    @GeneratedValue
    private BigInteger id;
    private BigInteger qid;
    private BigInteger uid;
    private Integer resvalue;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getQid() {
        return qid;
    }

    public void setQid(BigInteger qid) {
        this.qid = qid;
    }

    public BigInteger getUid() {
        return uid;
    }

    public void setUid(BigInteger uid) {
        this.uid = uid;
    }

    public Integer getResvalue() {
        return resvalue;
    }

    public void setResvalue(Integer resvalue) {
        this.resvalue = resvalue;
    }
}

