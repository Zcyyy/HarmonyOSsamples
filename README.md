# App Samples

-   [Introduction](#section1470103520301)
-   [Directory Structure](#sectionMenu)
-   [Usage](#section17988202503116)
-   [Constraints](#section18841871178)
-   [Repositories Involved](#section741114082513)

## Introduction

We provide a series of app samples to help you quickly get familiar with the APIs and development process of the HarmonyOS SDKs. Each app sample is an independent project in DevEco Studio. You can import an app sample into DevEco Studio and learn how to use APIs in the sample by browsing code, building the project, and installing and running the app.

## Directory Structure<a name="sectionMenu"></a>
- AI
  - [`AIFunctionSet:`AI (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/AI/AIFunctionSet)
- AccessibilityService 
  - [`AccessibilityService:`Accessibility Service (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/AccessibilityService/AccessibilityService)
- CompleteApps
  - [`DistributedSearch:`Distributed Search (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/CompleteApps/DistributedSearch) 
  - [`DistributedShoppingCart:`Distributed Shopping Cart (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/CompleteApps/DistributedShoppingCart) 
  - [`TicTacToeGame:`Tic-Tac-Toe (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/CompleteApps/TicTacToeGame) 
- ETSUI
  - [`eTSBuildCommonView:`Building a Common View (eTS)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ETSUI/eTSBuildCommonView) 
  - [`eTSDefiningPageLayoutAndConnection:`Defining Page Layout and Connection (eTS)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ETSUI/eTSDefiningPageLayoutAndConnection)
  - [`eTSDrawingAndAnimation:`Drawing and Animation (eTS)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ETSUI/eTSDrawingAndAnimation)
  - [`ColorFilterSample:`Setting picture color (ArkTS)](https://gitee.com/hundred_miles_long_sky/samples/tree/master/ETSUI/ColorFilterSample)
  - [`BorderImageSample:`Component Image Dynamic Border (ArkTS)](https://gitee.com/harmonyos/samples/tree/master/ETSUI/BorderImageSample)
  - [`AboutSample:`Apply About Page (ArkTS) (API9)](ETSUI/AboutSample)
  - [`BusinessSample:`Personal information page (ArkTS) (API9)](ETSUI/BusinessSample)
  - [`CategoryListSample:`Category list page (ArkTS) (API9)](ETSUI/CategoryListSample)
  - [`CategorySample:`Category layout (ArkTS) (API9)](ETSUI/CategorySample)
  - [`GridSample:`Grid Layout (ArkTS) (API9)](ETSUI/GridSample)
  - [`ListSample:`List content page (ArkTS) (API9)](ETSUI/ListSample)
  - [`LoginSample:`Application login page (ArkTS) (API9)](ETSUI/LoginSample)
  - [`SplashScreenSample:`Application start transition page (ArkTS) (API9)](ETSUI/SplashScreenSample)
- JAVAUI
  - [`Animation:`Animation (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/Animation) 
  - [`CommonLayout:`Common Layouts (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/CommonLayout)   
  - [`Components:`Components (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/Components) 
  - [`CustomComponent:`Custom Components (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/CustomComponent)   
  - [`CustomLayout:`Custom Layout (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/CustomLayout) 
  - [`Dialog:`Dialog (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/Dialog) 
  - [`List:`ListContainer (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/List) 
  - [`Localization:`Time Zone and Language (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/Localization) 
  - [`MultiModeInput:`Multimodal Input (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/MultiModeInput) 
  - [`MultimodalEvent:`Multimodal Input Standard Event (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/MultimodalEvent) 
  - [`PositionLayout:`PositionLayout (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/PositionLayout) 
  - [`ProgressBar:`ProgressBar (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/ProgressBar) 
  - [`TriangleJava:`Drawing Triangles Using OpenGL (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JAVAUI/TriangleJava)   
- JSUI
  - [`Image:`Basic Animation (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/Image) 
  - [`JsAdaptivePortalList:`Adaptive Portal List (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsAdaptivePortalList) 
  - [`JsAdaptivePortalPage:`Multi-Device Adaptive FA Page (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsAdaptivePortalPage) 
  - [`JsAdaptiveServiceWidget:`Multi-Device Adaptive Service Widget (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsAdaptiveServiceWidget) 
  - [`JsAnimation:`Animation App (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsAnimation) 
  - [`JsApp:`JS App (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsApp) 
  - [`JsCallJava:`JS Call Java (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsCallJava) 
  - [`JsComponents:` JS Components (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsComponents) 
  - [`JsFACard:`JS Service Widget Development (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsFACard) 
  - [`JsGallery:`Gallery App (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsGallery) 
  - [`JsShopping:`Shopping App (JS,Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsShopping) 
  - [`JsStartMode:`JS Startup Modal Configuration (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/JsStartMode) 
  - [`UiComponents:`JS UI (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/UiComponents) 
  - [`UserRegistration:`User Registration (JS & Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/JSUI/UserRegistration)   
- ability
  - [`AbilityConnection:`Ability Connection (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/AbilityConnection)   
  - [`AbilityForm:`AbilityForm (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/AbilityForm)   
  - [`AbilityIntent:`Explicit and Implicit Intents (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/AbilityIntent)   
  - [`AbilityInteraction:`Ability Interaction and Migration (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/AbilityInteraction)   
  - [`CommonEvent:`Common Event (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/CommonEvent)   
  - [`CustomNotification:`Custom Notification (JS)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/CustomNotification)   
  - [`DataAbility:`Data Ability (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/DataAbility)   
  - [`Delegator:`Ability Delegator (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/Delegator)   
  - [`DistributedMusicPlayer:`Distributed Music Player (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/DistributedMusicPlayer)   
  - [`DistributedScheduler:`Distributed Scheduler (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/DistributedScheduler)   
  - [`ForegroundService:`Foreground Service (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/ForegroundService)   
  - [`Fraction:`Fraction (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/Fraction)   
  - [`Idl:`IDL (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/Idl)   
  - [`Intent:`Intent (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/Intent) 
  - [`IntentAgent:`IntentAgent (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/IntentAgent) 
  - [`Notification:`Notification (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/Notification) 
  - [`PageAbility:`Page Ability (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/PageAbility) 
  - [`Pasteboard:`Pasteboard (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/Pasteboard) 
  - [`ServiceAbility:`Service Ability (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/ability/ServiceAbility) 
- common
  - [`Download:`Download Service (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/common/Download)
  - [`HelloWorld:`HelloWorld (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/common/HelloWorld)
  - [`Resources:`Resource File (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/common/Resources)
  - [`Timer:`Timer (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/common/Timer)
- data
  - [`DistributedPictures:`Distributed File Sharing (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/data/DistributedPictures)
  - [`ORM:`Object Relational Mapping (ORM) Database (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/data/ORM)
  - [`Preferences:`Lightweight Preference Database (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/data/Preferences)	
  - [`Search:`Search Service (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/data/Search)	
- device
  - [`BatteryInfo:`Battery Information (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/device/BatteryInfo)	
  - [`Compass:`Compass (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/device/Compass)	
  - [`Location:`Location (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/device/Location)	
  - [`Setting:`Setting (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/device/Setting)	  
- media
  - [`Audio:`Audio (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/media/Audio)
  - [`AudioPlayer:`Media Session (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/media/AudioPlayer)
  - [`Camera:`Camera (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/media/Camera)
  - [`PixelMap:`Pixelmap (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/media/PixelMap)
  - [`VideoPlayer:`Video Player (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/media/VideoPlayer)  
- native
  - [`JSNativeDemo:`JSNativeDemo (JS & C++)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/native/JSNativeDemo) 
  - [`NativeImage:`Native_image (Java & C++)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/native/NativeImage) 
  - [`NativeLayer:`Native_layer (Java & C++)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/native/NativeLayer)   
- network
  - [`Bluetooth:`Bluetooth (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/network/Bluetooth)
  - [`DistributedAbility:`Device and Service Discovery & Connection (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/network/DistributedAbility)
  - [`DistributedDevices:`Distributed Devices (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/network/DistributedDevices)
  - [`NFC:`NFC (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/network/NFC)
  - [`NetworkManagement:`Network Management (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/network/NetworkManagement)
  - [`WLAN:`WLAN (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/network/WLAN)
- security
  - [`DataSecurity:`Data Security (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/security/DataSecurity)  
  - [`FaceRecognition:`Facial Recognition (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/security/FaceRecognition)  
  - [`Permission:`Permission (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/security/Permission)    
- thread
  - [`EventHandler:`Inter-Thread Communication (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/thread/EventHandler)  
  - [`TaskDispatcher:`Thread Management (Java)](https://gitee.com/harmonyos/harmonyos_app_samples/tree/master/thread/TaskDispatcher)  
  
## Usage

1.  Import an app sample project into DevEco Studio for compilation, building, running, and debugging.
2.  Some app samples contain multiple modules. You can compile and build a single module to generate a HAP file or compile and build the entire project to generate multiple HAP files.
3.  After HAP installation and execution, you can view the execution effect of the app sample on the device and then conduct debugging.

## Constraints

1.  Before installing and running an app sample, check the **deviceType** field in the **config.json** file to obtain the device types supported by the sample. You can modify this field to enable the sample to run on your target device. (The **config.json** file is generally stored in the **entry/src/main** directory, which may be different depending on the samples.)
2.  If you want to run a sample on HarmonyOS, configure the development environment by referring to [HUAWEI DevEco Studio User Guide](https://developer.harmonyos.com/en/docs/documentation/doc-guides/tools_overview-0000001053582387).
3.  App samples that can run on standard-system or small-system devices (as stipulated in **Readme**) must run on OpenHarmony, whereas those that can run on large-system devices must run on HarmonyOS.
4.  For details about all app samples running on OpenHarmony, see the [app_samples](https://gitee.com/openharmony/app_samples) repository in the OpenHarmony community.

## Repositories Involved

1.  HarmonyOS scenario-specific app samples: [HarmonyOS codelabs](https://gitee.com/harmonyos/harmonyos_codelabs)
2.  OpenHarmony basic app samples: [OpenHarmony app_samples](https://gitee.com/openharmony/app_samples)
3.  OpenHarmony scenario-specific app samples: [OpenHarmony codelabs](https://gitee.com/openharmony/codelabs)
