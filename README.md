# DaggerHiltPart1

#### Todo 1
```gradle
buildscript {
    repositories {
         ...
        //todo 1
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:4.0.0"

        //todo 1
        classpath 'com.google.dagger:hilt-android-gradle-plugin:2.28-alpha'
    }
}
```

#### Todo 2
```gradle
//todo 2
apply plugin: 'com.android.application'
apply plugin: 'dagger.hilt.android.plugin'

dependencies {
    ...
    //todo 2
    implementation 'com.google.dagger:hilt-android:2.28-alpha'
    annotationProcessor 'com.google.dagger:hilt-android-compiler:2.28-alpha'
    implementation 'androidx.multidex:multidex:2.0.1'

}
```

#### Todo 3
```java
//todo 3
@HiltAndroidApp
public final class MyApp extends MultiDexApplication {}
```
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest>

    <application
        android:name=".MyApp">

    </application>

</manifest>
```

#### Todo 4
```java
//todo 4
@Module
@InstallIn(ApplicationComponent.class)
public final class AppModule {
    @Provides
    static String string(){
        return "providesString";
    }
}
```

#### Todo 5
```java
//todo 5
@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: "+str);
    }
}
```

---

```
Copyright 2021 M. Fadli Zein
```