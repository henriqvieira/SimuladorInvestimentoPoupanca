package Site;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObject {

    @FindBy(xpath = "//*[@id=\"valorAplicar\"]")
    private WebElement valorAplicar;

    @FindBy(xpath = "//*[@id=\"valorInvestir\"]")
    private WebElement valorInvestir;

    @FindBy(xpath = "//*[@id=\"tempo\"]")
    private WebElement tempo;

    @FindBy(xpath = "//*[@class=\"btn btnAmarelo btnSimular\"]")
    private WebElement btnSimular;

    @FindBy(xpath = "//*[@class=\"valor\"]")
    private WebElement valorResultado;

    @FindBy(xpath = "//*[@id=\"valorAplicar-error\"]")
    private WebElement valorAplicarErro;

    @FindBy(xpath = "//*[@id=\"valorInvestir-error\"]")
    private WebElement valorInvestirErro;

    public WebElement getValorAplicar(){ return this.valorAplicar; }

    public WebElement getValorInvestir(){ return this.valorInvestir; }

    public WebElement getTempo(){ return this.tempo; }

    public WebElement getBtnSimular(){ return this.btnSimular; }

    public WebElement getValorResultado(){ return this.valorResultado; }

    public WebElement getValorAplicarErro(){ return this.valorAplicarErro; }

    public WebElement getValorInvestirErro(){ return this.valorInvestirErro; }

}
