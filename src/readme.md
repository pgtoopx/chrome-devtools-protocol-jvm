# Web socket for Chrome DevTools Protocol

This tool allows you to interact with the Chrome DevTools protocol api.

To be able to use it, it is necessary to define the following parameter when creating a chromedriver

``System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, System.getProperty("user.dir") + "/target/chromedriver.log");``