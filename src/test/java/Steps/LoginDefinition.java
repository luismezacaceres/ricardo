package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginDefinition {
private WebDriver driver= Hooks.getDriver();
    @Given("^usuario se loguea correctamente$")
    public void usuario_se_loguea_correctamente() throws Throwable {
        WebElement inputUser = driver.findElement(By.name("userName"));
        inputUser.sendKeys("easytestautomation");

        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("easytestautomation");
        WebElement btnSubmit = driver.findElement(By.name("submit"));
        btnSubmit.click();
    }

    @When("^esta en la pagina de login exitoso$")
    public void esta_en_la_pagina_de_login_exitoso() throws Throwable {
        Assert.assertEquals("Login: Mercury Tours",driver.getTitle());
    }

    @Then("^muestra mensaje de exito$")
    public void muestra_mensaje_de_exito() throws Throwable {
        WebElement labelSatisfactorio = driver.findElement(By.xpath("//h3[contains(.,'Successfully')]"));
        Assert.assertTrue(labelSatisfactorio.isDisplayed());
    }
}
