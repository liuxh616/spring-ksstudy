package com.fengfang.proxy;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/8/13 16:23
 **/
public class Client {
    public static void main(String[] args) {
   /*     Host host = new Host();
        host.rent();*/
        Host host = new Host();
        //中介帮房贷租房子，代理一般会有一些附属操作
        RentProxy proxy = new RentProxy(host);
        //你不用面对房东，直接找中介租房
        proxy.rent();
    }
}
