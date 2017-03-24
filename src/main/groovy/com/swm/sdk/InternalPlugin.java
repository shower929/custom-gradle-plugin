package com.swm.sdk;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Created by yangzhenyu on 2017/3/24.
 */
public class InternalPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("sdk", SdkExtension.class);
    }

    class SdkExtension {
        String sdk;
    }
}
