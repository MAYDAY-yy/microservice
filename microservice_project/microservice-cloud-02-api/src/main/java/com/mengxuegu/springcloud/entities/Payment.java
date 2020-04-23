package com.mengxuegu.springcloud.entities;

public class Payment {

    private Long pid;
    private Long tid;
    private Long uid;
    private int flag;

    public Payment() {
    }

    public Payment(Long pid, Long tid, Long uid, int flag) {
        this.pid = pid;
        this.tid = tid;
        this.uid = uid;
        this.flag = flag;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
