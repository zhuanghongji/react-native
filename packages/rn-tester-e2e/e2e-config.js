// utility file to extract the config for E2E testing at runtime
// for appium
const path = require('path');
let capabilities;

const android = {
  'platformName': 'Android',
  'appium:platformVersion': '13.0',
  'appium:deviceName': 'Pixel_3a_API_33_arm64-v8a',
  'appium:app': path.join(process.cwd(), '/apps/rn-tester.apk'),
  'appium:automationName': 'UiAutomator2',
  'appium:newCommandTimeout': 240,
};

const ios = {
  'platformName': 'iOS',
  'appium:platformVersion': '16.1',
  'appium:deviceName': 'iPhone 14 Pro',
  'appium:automationName': 'XCUITest',
  'appium:app': path.join(process.cwd(), '/apps/rn-tester.app'),
};

if (!process.env.E2E_DEVICE) {
  throw new Error('E2E_DEVICE environment variable is not defined');
}

if (!(process.env.E2E_DEVICE.includes('android') || process.env.E2E_DEVICE.includes('ios'))) {
  throw new Error('No e2e device configuration found');
}

if (process.env.E2E_DEVICE === 'android') {
  capabilities = android;
}

if (process.env.E2E_DEVICE === 'ios') {
  capabilities = ios;
}

export default capabilities;
