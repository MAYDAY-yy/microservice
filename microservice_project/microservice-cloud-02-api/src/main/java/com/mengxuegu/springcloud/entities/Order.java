package com.mengxuegu.springcloud.entities;

public class Order {
    private Long oid;
    private Long tid;
    private Long uid;

    public Order() {
    }

    public Order(Long oid, Long tid, Long uid) {
        this.oid = oid;
        this.tid = tid;
        this.uid = uid;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }
}
