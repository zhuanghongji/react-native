const componentsScreen = require('../screenObjects/components.screen.js');
const buttonComponentScreen = require('../screenObjects/buttonComponent.screen.js');
const cancelText = 'Your application has been cancelled!';

describe('Test is checking cancel button', () => {
  test('Should view properly submit cancel text', async () => {
    expect(await componentsScreen.checkButtonComponentIsDisplayed()).toBeTruthy();
    await componentsScreen.clickButtonComponent();
    await buttonComponentScreen.clickCancelApplication();
    expect(await buttonComponentScreen.getAlertText()).toContain(cancelText);
    await buttonComponentScreen.clikOKButton();
  });
});
