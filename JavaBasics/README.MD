# Java Basics

## Description 
Given the next UML Diagram, code a Program that lets you choose a Vehicle and perform multiple operations such as:
- Turn the vehicle on and off
- Always show the speed of the vehicle 
- Refuel the vehicle
- Accelerate the vehicle
- Brake the vehicle

[![Imgur](https://i.imgur.com/tYNXc34.png)](https://i.imgur.com/tYNXc34.png)

## Acceptance Criteria

- All vehicles start with 0 speed, gas, and turned off
- Airplane, car and boat should start with a different maxGas and maxSpeed (Values are up to you, doesn't have to be real values)
- When refueling, the gas musn't be over the maxGas limit
- All vehicles accelerate an specific amount, and loose an specific gas quantity
- You can't accelerate or brake a vehicle when it's off
- Turning on a vehicle uses gas
- For turning off a vehicle it must have a speed of 0
- Negative speeds and gas doesn't exist
- Braking doesn't consume gas, but reduces speed
- You can't refuel if the vehicle is on
- When accelerating an Airplane and a Boat, the landed and dock are false
- Speed must be 0 to land and dock, and you must land turn off the airplane

## Symbology

    # Protected
    - Private
    + Public
    
    Italic means abstract
    
