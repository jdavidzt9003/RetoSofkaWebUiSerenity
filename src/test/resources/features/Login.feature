Feature: Yo como automatizador de pruebas
  deseo probar la seccion de login de la aplicación orangeHRM
  para verificar que la página cumpla los criterios de login

  Background:
    Given el usuario ingresa a la pagina de OrangeHRM sección login

  Scenario Outline: Inicio de sesion exitoso
    When el usuario ingresa los datos de username y password
      | username | <username> |
      | password | <password> |
    Then el sistema permite el login exitoso
    Examples:
      | username | password |
      | admin    | admin123 |

  Scenario Outline: Inicio de sesión donde el password inválido
    When el usuario ingresa el username correcto y el password inválido
      | username | <username> |
      | password | <password> |
    Then el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas para password
    Examples:
      | username | password  |
      | admin    | admin1234 |

  Scenario Outline: Inicio de sesión donde el usuario es inválido
    When el usuario ingresa el username inválido y el password correcto
      | username | <username> |
      | password | <password> |
    Then el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas para para usuario
    Examples:
      | username      | password |
      | administrador | admin123 |

  Scenario Outline: Inicio de sesión donde no se introducen las credenciales
    When el usuario deja los campos username y password vacíos
      | username | <username> |
      | password | <password> |
    Then el sistema no debe permitir el ingreso y debe arrojar el mensaje de campo vacío
    Examples:
      | username | password |
      | ""       | ""       |