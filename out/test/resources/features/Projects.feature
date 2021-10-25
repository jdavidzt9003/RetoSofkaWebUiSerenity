Feature: Creación de nuevo proyecto con dos administradores
  Yo como automatizador de pruebas
  quiero crear una automatización del nuevo proyecto, agregando el customer y minimos dos administradores de proyecto. Copiando información de otro proyecto con todos sus items
  donde el sistema me permita la creación del nuevo proyecto

  Scenario Outline: Agregar nuevo proyecto
    Given el usuario esta en la página OrangeHRM modulo time project info
      | username | <username> |
      | password | <password> |
    When agrega un nuevo proyecto haciendo la creación de un cliente e ingresando mínimo dos administradores de proyecto
      | customername        | <customername>        |
      | customerdescription | <customerdescription> |
      | name                | <name>                |
      | projectadmin        | <projectadmin>        |
      | projectadmin2       | <projectadmin2>       |
      | description         | <description>         |
      | projectnamecopy     | <projectnamecopy>     |

    Then el sistema deberá confirmar la creación del nuevo proyecto

    Examples:
      | username | password | customername | customerdescription  | name             | projectadmin | projectadmin2 | description         | projectnamecopy     |
      | Admin    | admin123 | new customer | Description customer | new project name | Cassidy Hope | Luke Wright   | Description project | ACME Ltd - ACME Ltd |