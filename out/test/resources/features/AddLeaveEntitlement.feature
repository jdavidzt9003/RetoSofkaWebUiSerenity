Feature: Asignar vacaciones a un empleado
  yo como automatizador de pruebas
  requiero programar el periodo de vacaciones a un empleado
  donde el sistema me arroje que ha sido exitosa la programación

  Scenario Outline: Para un empleado existente, programarle el período de vacaciones
    Given el automatizador inicia sesión se dirige al modulo leave
      | username | <username> |
      | password | <password> |

    Then el usuario diligencia el formulario para la programación de las vacaciones
      | Employee    | <Employee>    |
      | Entitlement | <Entitlement> |

    When el sistema arroja que se ha agregado el empleado al periodo de vacaciones

    Examples:
      | username | password | Employee    | Entitlement |
      | Admin    | admin123 | Aaliyah Haq | 6           |