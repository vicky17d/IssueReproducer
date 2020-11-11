package com.github.vicky17d.issuereproducer.classloaderissue;

import com.intellij.openapi.application.ApplicationManager;

public class MyService {
    public static MyService getInstance() {
        return ApplicationManager.getApplication().getService(MyService.class);
    }
}