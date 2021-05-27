# Mobile Automation (Android)
---

Pipefy app E2E testing project


## Pre-requisites:

- NodeJS
- Java 8
- Appium 
- Appium Doctor
- Maven
- Android SDK



### Install Appium

```
npm install -g appium
```

### Install Android SDK

Visit the page: [Android download](https://developer.android.com/studio#command-tools)


### Set up the environment variables:

Open `.bash_profile`

```
vim ~/.bash_profile
```

Add the following lines inside the opened file:

```
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$PATH:$JAVA_HOME
export PATH=$PATH:$JAVA_HOME/bin
export ANDROID_HOME=/Users/.../Library/Android/sdk
export ANDROID_SDK=$ANDROID_HOME
PATH=$PATH:$ANDROID_HOME/build-tools
PATH=$PATH:$ANDROID_HOME/tools
PATH=$PATH:$ANDROID_HOME/platform-tools
PATH=$PATH:$ANDROID_HOME/emulator/emulator
PATH=$PATH:$ANDROID_HOME/lib/
PATH=$PATH:$ANDROID_HOME/tools/lib
export PATH
```

Save and run `source` to apply the changes to your current session

```
source ~/.bash_profile
```


### Verifying the Installation

Install Appium doctor

```
npm install -g appium-doctor
```


Run in terminal:

```
appium-doctor --android
```

The output should contain something like this:

```
info AppiumDoctor Appium Doctor v.1.15.3
info AppiumDoctor ### Diagnostic for necessary dependencies starting ###
info AppiumDoctor  ✔ The Node.js binary was found at: /usr/local/bin/node
info AppiumDoctor  ✔ Node version is 12.18.4
info AppiumDoctor  ✔ ANDROID_HOME is set to: /Users/.../Library/Android/sdk
info AppiumDoctor  ✔ JAVA_HOME is set to: /Library/Java/JavaVirtualMachines/jdk1.8.0_261.jdk/Contents/Home
info AppiumDoctor    Checking adb, android, emulator
info AppiumDoctor      'adb' is in /Users/.../Library/Android/sdk/platform-tools/adb
info AppiumDoctor      'android' is in /Users/.../Library/Android/sdk/tools/android
info AppiumDoctor      'emulator' is in /Users/.../Library/Android/sdk/emulator/emulator
info AppiumDoctor  ✔ adb, android, emulator exist: /Users/.../Library/Android/sdk
info AppiumDoctor  ✔ Bin directory of $JAVA_HOME is set
```


### Starting android device

- Connect a real device via USB or launch an android emulator. 

*Note: For real devices, you have to ensure that Developer mode is turned on for the device.*

To make sure that this device is ready. Run in terminal the following command:

```
adb devices
```

The output should display all devices:

```
List of devices attached
emulator-5554	device
```


### Starting the Appium server

Run in terminal:

```
appium
```


### Running android test suite


```
mvn clean test -DsuiteXmlFile=suite.xml
```

