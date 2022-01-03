 <h1 align="center">Huawei ServiceHelper Github Documentation</h1>
 
 ![Latest Version](https://img.shields.io/badge/latestVersion-1.0.0-yellow)
 ![Supported Platform](https://img.shields.io/badge/Supported_Platform-Unity-orange)

# Introduction
In this documentation we explained how to use Service Helper package in **Unity** to detect HMS and GMS services.

# How to start?
#### 1- Make sure that you have completed the following integration:

#####  Huawei HMS AGC Services
https://assetstore.unity.com/packages/add-ons/services/huawei-hms-agc-services-176968

You can find Huawei HMS AGC Services Sample Project from here: <br>
https://github.com/Unity-Technologies/HuaweiServiceSample
 <br>
#### 2- Make sure that you have completed one of the following integration:

##### Huawei-AdMob Mediation
https://github.com/Explore-In-HMS/huawei.ads.admob_mediation

##### Huawei-Mopub Mediation
https://github.com/Explore-In-HMS/huawei.ads.mopub_mediation <br>

#### 3- Download the latest ServiceHelper.unitypackage release from here
https://github.com/Explore-In-HMS/huawei.servicehelper/releases <br>

#### 4- Import ServiceHelper.unitypackage to your project.
**Assets** > **Import Package** > **Custom Package** then select ServiceHelper.unitypackage and click **Open** or you can just drag the unitypackage to the Asset Folder. Then simply click **Import**.

You can now use Official HMS Unity Plugin when HMS is available and use a Mediation method when HMS is not available.

**Sample Usage:**
```csharp
  if (ServiceHelper.IsHMSAvailable()) {  
    Debug.Log("HMS is available initialize Huawei Ads with Official HMS Unity Plugin");
    // Initialize ads through Official HMS Unity Plugin 
    AdsTest.GetInstance().RegisterEvent(RegistEvent);    
  } else {  
    Debug.Log("HMS is not available use Admob SDK with Huawei Admob mediation");
    //Initialize ads through Admob Mediation    
    InitAdmobMediation();    
  }
```

**Note:** Unity’s minify option might cause ServiceHelper.aar to not build.

In case of such an error
- Go To **Edit** -> **Project Settings** -> **Player**
- Make sure  **no Minify** option selected.
- Open Custom  **Laucher Gradle Template** if it’s closed.
- Open **launcherTemplate.gradle** file and  **delete minifyEnabled** from buildTypes – release.
