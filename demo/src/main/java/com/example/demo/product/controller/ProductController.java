package com.example.demo.product.controller;

import com.example.demo.Account.UserTokenRepository;
import com.example.demo.product.form.RegisterRequestProductForm;
import com.example.demo.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    final private ProductService productService;
    final private UserTokenRepository userTokenRepository;

    @PostMapping(value = "/register",
    consumes = {
        MediaType.MULTIPART_FORM_DATA_VALUE, //요청 데이터에 파일이 첨부될수있음
                MediaType.APPLICATION_JSON_VALUE })
    public boolean registerProduct (@RequestPart(value = "imageFile") List<MultipartFile> fileList,
                                  @RequestPart(value = "productInfo") RegisterRequestProductForm info){
        log.info("registerProduct()");
        log.info(info.getUserToken());
        log.info(info.getProductDetails());
        log.info(info.getProductName());
        log.info(info.getVendor());
        log.info(info.getProductName());


        return productService.register(info, fileList);
    }

}