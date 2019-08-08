# PASETO: Platform-Agnostic Security Tokens

Android Implementation of Platform-Agnostic Security Tokens - https://paseto.io

This is a simple layer on top of my Java Paseto library which adds Android support.

## Usage
#### Gradle (top level)

```gradle
allprojects {
	repositories {
		maven { url  "https://dl.bintray.com/terl/lazysodium-maven" }
	}
}
```

#### Gradle (app)
```gradle
dependencies {
	implementation 'net.aholbrook.paseto.android:meta:0.5.0'
	implementation 'com.jakewharton.threetenabp:threetenabp:1.2.0'
}
```

#### Application Class
Paseto requires the Java 8 Time API (JSR 310). Since these APIs are not available on Android, we use the [ThreeTen-ABP](https://github.com/JakeWharton/ThreeTenABP) project to provide JSR 310. 

You'll have to initialize the timezone information in your `Application.onCreate()` method:
```java
@Override public void onCreate() {
	super.onCreate();
	AndroidThreeTen.init(this);
}
```
More info can be found at the [ThreeTen-ABP](https://github.com/JakeWharton/ThreeTenABP) project page.

## Documentation
Please refer to the Java project (the API is identical beyond the initial setup):

https://github.com/atholbro/paseto

#### Sample Application
A sample Android project is also included in this repository:
https://github.com/atholbro/paseto-android/tree/master/sample
