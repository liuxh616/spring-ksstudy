package com.fengfang.proxy;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/13 16:24
 **/
public class RentProxy implements Rent {
    private Host host;

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public RentProxy() {
    }

    public RentProxy(Host host) {
        this.host = host;
    }

    public void rent(){
        this.seeHourse();
        this.hetong();
        this.fare();
        this.host.rent();
    }
    public void seeHourse(){
        System.out.println("中介带你去看房！！！");
    }

    public void hetong(){
        System.out.println("中介帮房东签合同 ！");
    }

    public void fare(){
        System.out.println("收中介费！");
    }
}
