package Site;

import Driver.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class ActionHome extends HomeObject{

    public ActionHome() {
        PageFactory.initElements(DriverWeb.getDriver(), this);
    }

    public void actionValorAplicar(String valorAplicar) {
        getValorAplicar().clear();
        getValorAplicar().sendKeys(valorAplicar, Keys.TAB);
    }

    public void actionValorInvestir(String valorInvestir) {
        getValorInvestir().clear();
        getValorInvestir().sendKeys(valorInvestir, Keys.TAB);
    }

    public void actionTempo(String valorTempo) {
        getTempo().clear();
        getTempo().sendKeys(valorTempo);
    }

    public void actionBtnSimular() {
        getBtnSimular().click();
    }
}
