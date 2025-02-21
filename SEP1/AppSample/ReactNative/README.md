# React native
- React native là 1 framework của React sử dụng để build Native cho cả Android và IOS
- Phương thức SDK: .aar

# Hướng dẫn build app react native
Yêu cầu
============

Để build zDefend App sample, bạn  cần:

* Có quyền truy cập trong zConsole

* Java Runtime Environment

* React Native with Android and iOS support

* Android device or emulator

* iOS device or simulator

For more specific information on the zDefend SDK requirements, refer to the "zDefend SDK Developer's Guide".

Building and Running the Sample App
===================================

1. Configure the sample app in zConsole:

   a) Configure the app activations:

      * If your zDefend SDK package does not have pre-embedded license keys and bundle IDs, create one app activation to use the bundle ID "com.zreactnativesample".

        In the case of this sample app, the bundle ID is the same for the Android and iOS editions of the app. Once you have the app activation, save its license key in a text editor or file for future reference.

      * If your zDefend SDK package has pre-embedded license keys and bundle IDs, create two app activations with the bundle IDs you supplied to the package request form and also make sure you select the "Enable Dev Mode" check box in the app activation settings. This allows running a protected app whose actual bundle ID does not match the one embedded in zDefend SDK, which is the case with this sample app.

   b) Configure policies for the app according to your needs.

      Note: The sample app uses a linked function associated with the label "RISKY_TAPPED". If you want to test this linked function, configure one or several threats in your policy to trigger this label.

   For information on creating app activations, license keys, and policies in zConsole, see the "zDefend Console User Guide" in the zConsole documentation set.

2. If your zDefend SDK package does not have a pre-embedded license key and bundle ID, manually embed the license key and bundle ID into the zDefend React Native SDK:

   a) Create a new directory anywhere on your computer.

   b) Copy the following files from the zDefend SDK package to the new directory you just created:

      * "config_sdk_«version».jar"

        If you do not have this file in your package, it means your zDefend SDK already has the license keys and bundle IDs embedded in the code and you can skip this manual embedding process.

      * "zdefend-react-native-sdk-«version and date».tgz" (located in the "react-native" directory)

   c) For convenience, rename the "zdefend-react-native-sdk-«version and date».tgz" file to "zdefend-react-native-sdk_unlicensed.tgz".

   d) In the directory, execute the following command:

      java -jar config_sdk_«version».jar \
      -s zdefend-react-native-sdk_unlicensed.tgz \
      -o zdefend-react-native-sdk.tgz \
      -k «license key» \
      -b com.zreactnativesample \
      -v

      Note: The license key must be the one you saved in step 1a.

      If the process is successfully completed, you should see a new file "zdefend-react-native-sdk.tgz" in the directory. This is the configured copy of the original TGZ file, which now contains the license key and bundle ID.

3. Add the zDefend SDK to the sample app:

   a) Move the "zdefend-react-native-sdk.tgz" file to the parent directory of the directory where the sample app is extracted.

      For example, if you extracted the sample app in the directory "/Users/test/projects/sample-app", then you must move the "zdefend-react-native-sdk.tgz" file to the "/Users/test/projects" directory.

      Note: You do not have to extract the "zdefend-react-native-sdk.tgz" archive.

   b) Navigate to the "zReactNativeSample" directory and execute the following command:

      yarn add ../zdefend-react-native-sdk.tgz

4. Build and run the app using React Native as usual.

Additional Information
======================

For more information on zDefend SDK, refer to the official documentation here:

https://devportal.zimperium.com/doc/en/zdefend/
