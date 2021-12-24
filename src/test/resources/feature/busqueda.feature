Feature: Busqueda en google
  Verificar cantidad de resultados de busqueda en google

   Scenario Outline: Cantidad de resultados
    Given ingreso a google a chrome
    When busco la palabra "<parametro>"
    Then se muestran resultados para la busqueda

    Examples: 
      | parametro |
      | simetrik  |
      