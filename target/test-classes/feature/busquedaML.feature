Feature: Busqueda en mercadolibre
  Obtener los 3 primeros resultados de MercadoLibre al buscar camisetas

   Scenario Outline: Resultados de busqueda
    Given ingreso a la pagina de MercadoLibre
    When busco la palabra "<parametro>"
    Then se muestra el detalle de los "<cantidad>" primeros resultados para la busqueda

    Examples: 
      | parametro | cantidad |
      | camiseta  | 3        |