#language:pt
@Site
Funcionalidade: Verificar Site Sicredi
  Contexto:
    Dado que acessei o Site Sicredi

Esquema do Cenário: Realizar simulacao de invetimentos - "<cenario>"
    Quando selecionei o Simulador de Investimento - Poupanca - "<cenario>"
     Entao verifiquei o formulario de simulacao - "<cenario>"
      Exemplos:
      |cenario|
      |PreencherTodosValores     |
      |ValorMenorQueOMinimo      |