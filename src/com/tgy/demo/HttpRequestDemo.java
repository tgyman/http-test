package com.tgy.demo;

import com.tgy.myhttp.HttpRequest;

/**
 * HttpRequestDemo
 *
 * @author Jerry Tong
 * @create 2017-11-24 16:34
 * @desc HttpRequest请求测试demo
 */
public class HttpRequestDemo {
    public static void main(String[] args) {
        //发送GET请求
        //https://www.baidu.com/his?wd=&from=pc_web&rf=3&hisdata=&json=1&p=3&sid=1438_19033_21111_25177_20929&req=2&csor=0&cb=jQuery11020775861421116635_1511511940763&_=1511511940764
        String s= HttpRequest.sendGet("https://nrpc.olark.com/nrpc/c","c=create&s=1356-750-10-5709&v=8IyGTwhdM3UOo88o9851D0H3RE0R9Xa2&i=49JNxQ2mBSPPJZHC9851D0H3RE0RobX9&g=ALL&q=precache023320757420660576&j=o0&version=loader-precache&xhttp=1&u=https%3A%2F%2Fwww.elastic.co%2Fproducts%2Felasticsearch&r=");
        System.out.println(s);
    }
}
/*
*
*响应结果:
*
{
    "conversation_history": [],
    "capacity": false,
    "site_is_online": false,
    "status_state": "offline",
    "conversation_has_slot": false,
    "site_config_changed": false,
    "assets_config_md5": "f97bc9089c3b98bf0d7cd13ab78400dc",
    "ipaddress": "210.12.140.34",
    "geolocation_data": {
        "ipaddress": "210.12.140.34",
        "city": "Beijing",
        "state": "22",
        "country": "China",
        "country_code": "CN",
        "lat": 39.9289,
        "long": 116.38830000000002,
        "isp": "China Unicom IP network",
        "organization": "China Unicom Beijing",
        "domain": ""
    },
    "operator_composing_state": "active",
    "operator_nickname": null,
    "in_active_conversation": false,
    "operator_has_sent_message": false,
    "ssl": true,
    "is_premium": true,
    "is_popup": false,
    "visitor_id": "8IyGTwhdM3UOo88o9851D0H3RE0R9Xa2",
    "dormant": true,
    "conversation_id": "49JNxQ2mBSPPJZHC9851D0H3RE0RobX9",
    "resend_nickname": false,
    "resend_status": false,
    "machine": "nrpc60.gcp.olark.net"
}
**/