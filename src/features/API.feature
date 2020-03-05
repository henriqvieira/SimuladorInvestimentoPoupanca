#language:pt
    @API
    Funcionalidade: Verificar Servico Simulador
  Contexto:
    Dado que acessei o servico

  Esquema do Cenário: Consultar servico - "<servico>"
    Quando consultei o servico - "<servico>"
    Entao verifiquei o servico - "<servico>"
      Exemplos:
      |servico|
      |simulador      |
