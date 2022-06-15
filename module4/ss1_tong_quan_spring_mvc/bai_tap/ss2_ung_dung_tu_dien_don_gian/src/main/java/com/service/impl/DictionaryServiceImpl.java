package com.service.impl;

import com.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Override
    public String searchDictionary(String english) {
        String vietNam;
        switch (english){
            case "dog":
                vietNam = "chó";
                break;
            case "cat":
                vietNam = "mèo";
                break;
            case "hello":
                vietNam = "Xin Chào";
                break;
            case "beautiful":
                vietNam = "xinh đẹp";
                break;
            case "book":
                vietNam = "sách";
                break;
            case "Picture":
                vietNam = "hình ảnh";
                break;
            default:
                vietNam = "không có trong từ điển!";
                break;
        }
        return vietNam;
    }
}
