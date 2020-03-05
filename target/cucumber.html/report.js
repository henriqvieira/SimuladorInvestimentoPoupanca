$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/API.feature");
formatter.feature({
  "name": "Verificar Servico Simulador",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Consultar servico - \"\u003cservico\u003e\"",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "consultei o servico - \"\u003cservico\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "verifiquei o servico - \"\u003cservico\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "servico"
      ]
    },
    {
      "cells": [
        "simulador"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que acessei o servico",
  "keyword": "Dado "
});
formatter.match({
  "location": "TestService_Simulador.acessei_o_servico()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Consultar servico - \"simulador\"",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "consultei o servico - \"simulador\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestService_Simulador.consultei_servico(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifiquei o servico - \"simulador\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestService_Simulador.verifiquei_servico(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/features/Site.feature");
formatter.feature({
  "name": "Verificar Site Sicredi",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Site"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Realizar simulacao de invetimentos - \"\u003ccenario\u003e\"",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "selecionei o Simulador de Investimento - Poupanca - \"\u003ccenario\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "verifiquei o formulario de simulacao - \"\u003ccenario\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "cenario"
      ]
    },
    {
      "cells": [
        "PreencherTodosValores"
      ]
    },
    {
      "cells": [
        "ValorMenorQueOMinimo"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que acessei o Site Sicredi",
  "keyword": "Dado "
});
formatter.match({
  "location": "TestSite_SimuladorPoupanca.acessei_o_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar simulacao de invetimentos - \"PreencherTodosValores\"",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@Site"
    }
  ]
});
formatter.step({
  "name": "selecionei o Simulador de Investimento - Poupanca - \"PreencherTodosValores\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestSite_SimuladorPoupanca.preencher_formulario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifiquei o formulario de simulacao - \"PreencherTodosValores\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestSite_SimuladorPoupanca.verifiquei_simulacao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que acessei o Site Sicredi",
  "keyword": "Dado "
});
formatter.match({
  "location": "TestSite_SimuladorPoupanca.acessei_o_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar simulacao de invetimentos - \"ValorMenorQueOMinimo\"",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@Site"
    }
  ]
});
formatter.step({
  "name": "selecionei o Simulador de Investimento - Poupanca - \"ValorMenorQueOMinimo\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestSite_SimuladorPoupanca.preencher_formulario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifiquei o formulario de simulacao - \"ValorMenorQueOMinimo\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestSite_SimuladorPoupanca.verifiquei_simulacao(String)"
});
formatter.result({
  "status": "passed"
});
});