import Driver.DriverRest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestService_Simulador {

    DriverRest rest;

    @Dado("que acessei o servico")
    public void acessei_o_servico(){ }

    @Quando("consultei o servico - {string}")
    public void consultei_servico (String url){ rest = new DriverRest(url); }

    @Entao("verifiquei o servico - {string}")
    public void verifiquei_servico(String url) {
        switch (url) {
            case "simulador":
                rest.getResponse().then()
                        .statusCode(200)
                        .contentType(ContentType.JSON)
                        .body("id", equalTo(1))
                        .body("meses", contains("112", "124", "136", "148"))
                        .body("valor", contains("2.802", "3.174", "3.564", "3.971"));
                break;
        }
    }
}
