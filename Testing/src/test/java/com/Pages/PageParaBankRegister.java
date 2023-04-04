package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageParaBankRegister extends BasePage {

//    Haga clic en <Register>
    By SignUpButton = By.linkText("Register");

//    Rellene el formulario de registro con los datos requeridos

    By inputFirstName = By.name("customer.firstName");
    By inputLastName = By.name("customer.lastName");

    By inputAddress = By.name("customer.address.street");

    By inputCity = By.name("customer.address.city");

    By inputState = By.name("customer.address.state");

    By inputZipCode = By.name("customer.address.zipCode");

    By inputPhone = By.name("customer.phoneNumber");

    By inputSSN = By.name("customer.ssn");

    By inputUserName = By.name("customer.username");

    By inputPassword = By.name("customer.password");

    By inputConfirm = By.name("repeatedPassword");

    By RegisterButton = By.linkText("Register");

//    Compruebe que el texto "Su cuenta se ha creado correctamente. En la pantalla se puede ver "You are
//    now logged in".

    By resultMessage = By.xpath("/html/body/div[1]/div[3]/div[2]/p");

    public PageParaBankRegister(WebDriver driver) {
    }

    public void RegisterUser(){
        oprimir(SignUpButton);
        teclear("Romina", inputFirstName);
        teclear("Vilatta", inputLastName);
        teclear("Cordoba Pá", inputAddress);
        teclear("San Diego", inputCity);
        teclear("California", inputState);
        teclear("S50823", inputZipCode);
        teclear("7612547",inputPhone);
        teclear("ASLDJ", inputSSN);
        teclear("Romivilita23", inputUserName);
        teclear("21316", inputPassword);
        teclear("21316", inputConfirm);
        oprimir(RegisterButton);

        waitForTextToBePresent(resultMessage, "Your account was created successfully. You are now logged in.", 10);

    }
}
