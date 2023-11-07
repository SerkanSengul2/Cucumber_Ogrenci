Feature:

  Scenario:
    When Write username "Serkan"
    And Write Username and Password "Serkan" and "1234"

    And Write username as DataTable

      | Hamza    |
      | Hamdi    |
      | Memduh   |
      | Siddik   |
      | Ebubekir |

    And Write username and Password as DataTable
      | Hamza    | 123    |
      | Hamdi    | 1234   |
      | Memduh   | 12345  |
      | Siddik   | 123456 |