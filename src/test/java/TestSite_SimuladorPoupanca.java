import Driver.DriverWeb;
import Site.ActionHome;
import cucumber.api.java.pt.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestSite_SimuladorPoupanca {
    ActionHome home;

    @Dado("que acessei o Site Sicredi")
    public void acessei_o_site(){
        DriverWeb.SetupDriver();
        home = new ActionHome();
    }

    @Quando("selecionei o Simulador de Investimento - Poupanca - {string}")
    public void preencher_formulario(String cenario) throws InterruptedException {
        switch (cenario) {
            case "PreencherTodosValores":
                DriverWeb.timeS(1500);
                home.actionValorAplicar("200000");
                home.actionValorInvestir("10000");
                home.actionTempo("12");
                home.actionBtnSimular();
                break;
            case "ValorMenorQueOMinimo":
                DriverWeb.timeS(1500);
                home.actionValorAplicar("1000");
                home.actionValorInvestir("1000");
                home.actionTempo("12");
                break;
        }
    }

    @Entao("verifiquei o formulario de simulacao - {string}")
    public void verifiquei_simulacao(String cenario) throws InterruptedException {
        switch (cenario) {
            case "PreencherTodosValores":
                DriverWeb.timeS(1500);
                assertEquals("R$ 3.276", home.getValorResultado().getText());
                DriverWeb.Quit();
                break;
            case "ValorMenorQueOMinimo":
                assertEquals("Valor mínimo de 20.00", home.getValorAplicarErro().getText());
                assertEquals("Valor mínimo de 20.00", home.getValorInvestirErro().getText());
                DriverWeb.Quit();
                break;
        }
    }
}
