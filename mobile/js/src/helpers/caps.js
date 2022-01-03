const android_emu_caps = {
    platformName: "Android",
    platformVersion: "7",
    deviceName: "Android Emulator",
    app: "/Users/rajendersinghharit/Downloads/ApiDemos-debug.apk",
    appPackage: "io.appium.android.apis",
    appActivity: ".view.TextFields",
    automationName: "UiAutomator2"
}

const ios_emu_caps = {
    platformName : 'ios',
    automationName : '',
    deviceName : "",
    platformVersion: "",
    app: undefined
}

const devices_caps = {
    android_emu : {      
        path: '/wd/hub',
        port: 4723,
        capabilities: android_emu_caps
    },
    ios_emu : ios_emu_caps
};

const appServerConfig = {
    path: '/wd/hub',
    host: "",
    port: 4723,
  };

module.exports = {
    devices_caps,
    appServerConfig
  };

