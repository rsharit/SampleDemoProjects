const webdriverio = require('webdriverio');
const assert = require("assert");
const capabilities = require("../src/helpers/caps").devices_caps;
const appServerconf = require("../src/helpers/caps").appServerConfig;


describe('Create Android session', function () {
    let client;
  
    before(async function () {
      client = await webdriverio.remote(capabilities.android_emu);
      //await client.startRecordingScreen();
    });
  
    it('Reading filler text', async function () {

      const field = await client.$("android.widget.EditText");
      const value = await field.getText();
      assert.strictEqual(value,"hint text");
  
    });

    it('Setting Hello World! & comparing value', async function () {

      const field = await client.$("android.widget.EditText");
      await field.setValue("Hello World!");
      const value = await field.getText();
      assert.strictEqual(value,"Hello World!");
  
    });

    after(async function(){
      //await client.stopRecordingScreen();
      const delete_session = await client.deleteSession();
    });
  });