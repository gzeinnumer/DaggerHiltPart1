package com.gzeinnumer.daggerhiltpart1.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

//todo 4
@Module
@InstallIn(ApplicationComponent.class)
public final class AppModule {
    @Provides
    static String string(){
        return "providesString";
    }
}
