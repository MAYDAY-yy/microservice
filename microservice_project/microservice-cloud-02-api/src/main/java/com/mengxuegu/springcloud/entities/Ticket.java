package com.mengxuegu.springcloud.entities;

public class Ticket {
    private Long  tid;   //主键

    private String  ticketName;

    private int number;

    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String  dbSource;

    public Ticket() {
    }

    public Ticket(Long tid, String ticketName, int number, String dbSource) {
        this.tid = tid;
        this.ticketName = ticketName;
        this.number = number;
        this.dbSource = dbSource;
    }

    public Ticket(String ticketName, int number) {
        this.ticketName = ticketName;
        this.number = number;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
