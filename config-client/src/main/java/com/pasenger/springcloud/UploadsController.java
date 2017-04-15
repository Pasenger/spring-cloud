package com.pasenger.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pasenger on 2017/4/15.
 */

@RestController
@RequestMapping(value = "/upload")
public class UploadsController {

    @Value("${upload.dir}")
    private String uploadDir;

    @Value("${upload.suffix}")
    private String uploadSuffix;


    @RequestMapping(value = "/dir", method = RequestMethod.GET)
    public String getUploadDirApi(){
        return uploadDir;
    }

    @RequestMapping(value = "/suffix", method = RequestMethod.GET)
    public String getUploadSuffixApi(){
        return uploadSuffix;
    }

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    public String getUploadSuffix() {
        return uploadSuffix;
    }

    public void setUploadSuffix(String uploadSuffix) {
        this.uploadSuffix = uploadSuffix;
    }
}
