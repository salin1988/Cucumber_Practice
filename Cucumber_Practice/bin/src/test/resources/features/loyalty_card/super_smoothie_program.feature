Feature:  Super smoothie loyalty card program
  The more smoothie you buy, the more points you get

  Background:
    Given the following drink categories:
    | Drink              | Category | Points |
    | Banana             | Regular  | 15     |
    | Triple Berry Blend | Fancy    | 20     |
    | Earl Grey          | Tea      | 10     |

  Scenario Outline: Earning Points when purchasing smoothie
    Given Michael is a Morning Freshness Member
    When Michael purchases <Quantity> <Drink> drinks
    Then he should earn <Points> points
    Examples:
    | Drink              | Quantity | Points |
    | Banana             | 2        | 30     |
    | Triple Berry Blend | 1        | 20    |
    | Earl Grey          | 3        | 30     |

