Exp: @@x_arr[@@z]

State: Before

* Global Variables

  * @@x_arr = KArray#0

    * min=i1; length=i2; max=i3

    * [1] = i5

  * @@y = i4

* Path Conditions

  * i1 <= i3

  * 0 <= i2

  * i2 == i3 - i1 + 1

  * 1 <= i2

  * 1 == i4

----

+---------------------------------+---------------------------------+
|                                 |                                 |
| State: After                    | State: After (Semi-Concrete)    |
|                                 |                                 |
| * Global Variables              | * Global Variables              |
|                                 |                                 |
|   * @@x_arr = KArray#0          |   * @@x_arr = KArray#0          |
|                                 |                                 |
|     * min=i1; length=i2; max=i3 |     * min=0; length=2; max=1    |
|                                 |                                 |
|     * [1] = i5                  |     * [1] = i5                  |
|                                 |                                 |
|     * [i6] = i7                 |     * [4] = i7                  |
|                                 |                                 |
|   * @@y = i4                    |   * @@y = 1                     |
|                                 |                                 |
|   * @@z = i6                    |   * @@z = 4                     |
|                                 |                                 |
| * Path Conditions               | * Path Conditions               |
|                                 |                                 |
|   * i1 <= i3                    |   * 0 <= 1                      |
|                                 |                                 |
|   * 0 <= i2                     |   * 0 <= 2                      |
|                                 |                                 |
|   * i2 == i3 - i1 + 1           |   * 2 == 1 - 0 + 1              |
|                                 |                                 |
|   * 1 <= i2                     |   * 1 <= 2                      |
|                                 |                                 |
|   * 1 == i4                     |   * 1 == 1                      |
|                                 |                                 |
|   * 2 <= i2                     |   * 2 <= 2                      |
|                                 |                                 |
|   * i6 != 1                     |   * 4 != 1                      |
|                                 |                                 |
| * Result: i7                    | * Result: i7                    |
|                                 |                                 |
+---------------------------------+---------------------------------+

----

+---------------------------------+---------------------------------+
|                                 |                                 |
| State: After                    | State: After (Semi-Concrete)    |
|                                 |                                 |
| * Global Variables              | * Global Variables              |
|                                 |                                 |
|   * @@x_arr = KArray#0          |   * @@x_arr = KArray#0          |
|                                 |                                 |
|     * min=i1; length=i2; max=i3 |     * min=0; length=1; max=0    |
|                                 |                                 |
|     * [1] = i5                  |     * [1] = i5                  |
|                                 |                                 |
|   * @@y = i4                    |   * @@y = 1                     |
|                                 |                                 |
|   * @@z = i6                    |   * @@z = 1                     |
|                                 |                                 |
| * Path Conditions               | * Path Conditions               |
|                                 |                                 |
|   * i1 <= i3                    |   * 0 <= 0                      |
|                                 |                                 |
|   * 0 <= i2                     |   * 0 <= 1                      |
|                                 |                                 |
|   * i2 == i3 - i1 + 1           |   * 1 == 0 - 0 + 1              |
|                                 |                                 |
|   * 1 <= i2                     |   * 1 <= 1                      |
|                                 |                                 |
|   * 1 == i4                     |   * 1 == 1                      |
|                                 |                                 |
|   * i6 == 1                     |   * 1 == 1                      |
|                                 |                                 |
| * Result: i5                    | * Result: i5                    |
|                                 |                                 |
+---------------------------------+---------------------------------+
