# How to add a test

1. Create a test file `(rn-tester-e2e/test/spec)` - simple jest spec files
2. **OPTIONAL -** Create a screen object or extend the existing one (depends on the test scope) - `rn-tester-e2e/test/screenObjects` - map screen elements for iOS and Android and add needed functions

# How to execute a test
1. Open new Terminal -> navigate to the react-native path -> open Metro by typing 
>yarn start

or 

>npm start


2. Open second terminal -> navigate to the react-native/packages/rn-tester-e2e -> MAKE SURE YOUR APPIUM HAS UIAUTOMATOR2 AND XCUITEST INSTALLED! type 
>appium --base-path /wd/hub
3. Open third terminal -> navigate to the react-native/packages/rn-tester-e2e -> run all tests by typing
>npm run ios

or 

>npm run android