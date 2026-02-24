Feature: Timer functionality and button labels

  Scenario: Test labels for Idle, Paused, Ringing, Running, and Set Timers
    Given the timer is idle
    When I check the button labels
    Then the labels should be "change mode", "run", "set"
    And the display text should be "IdleTimer", "timer", "memTimer = 0"

  Scenario: Test Timer Button Labels in Idle State
    Given the timer is idle
    When I check the button labels in the Idle state
    Then the labels should be "change mode", "run", "set"
    And the display text should be "IdleTimer", "timer", "memTimer = 0"

  Scenario: Test Timer Button Labels in Set Timer State
    Given the timer is in the Set Timer state
    When I check the button labels in the Set Timer state
    Then the labels should be "reset", "inc 5", "done"
    And the display text should be "SetTimer", "timer", "memTimer = 0"

  Scenario: Test Stopwatch Button Labels in Initial Mode
    Given the timer is in the initial Stopwatch mode
    When I check the button labels in the Stopwatch mode
    Then the labels should be "change mode", "run", "(unused)"

  Scenario: Test Stopwatch Button Labels after mode change
    Given the timer is in Stopwatch mode
    When I click the left button and then the up button
    Then the labels should be "change mode", "split", "reset"