@Test
public void testBlockTitle() {
    WebElement blockTitle = driver.findElement(By.xpath("//h2[text()='Онлайн пополнение без комиссии']"));
    Assert.assertNotNull(blockTitle, "Блок 'Онлайн пополнение без комиссии' не найден");
}

@Test
public void testPaymentSystemLogos() {
    WebElement logoVisa = driver.findElement(By.cssSelector("img[src*='visa.png']"));
    WebElement logoMasterCard = driver.findElement(By.cssSelector("img[src*='mastercard.png']"));
    Assert.assertTrue(logoVisa.isDisplayed(), "Логотип Visa не отображается");
    Assert.assertTrue(logoMasterCard.isDisplayed(), "Логотип MasterCard не отображается");
}

@Test
public void testMoreInfoLink() {
    WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
    moreInfoLink.click();
    Assert.assertEquals(driver.getCurrentUrl(), "https://mts.by/some-info-page");
}

@Test
public void testContinueButton() {
    driver.findElement(By.id("serviceType")).click();
    driver.findElement(By.xpath("//option[text()='Услуги связи']")).click();
    driver.findElement(By.id("phoneNumber")).sendKeys("297777777");
    driver.findElement(By.id("continueButton")).click();
    WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage"));
    Assert.assertTrue(confirmationMessage.isDisplayed(), "Сообщение о подтверждении не отображается");
}
        }
