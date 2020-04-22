Thief Game

A thief "simulator" where you can use a GUI to plan and execute heists
your goal is to generate wealth

Design patterns

    Factory
        Create new heist opportunities

    Observer 
        Tracks the player and will notify the user about the happenings on the field

    Decorator
        Give values to the stealable items, have variants to the items,
        for example, if there was a ring, it could be a
        gold ring, a silver ring and that would change its value
        
    Strategy
        Make the player choose their equipment before heading out on a mission.
        -Stealth Gear
        -Normal Gear
        -Guns Blazing Gear
        Each heist has an optimal gear assigned, if the chosen equipment has an impact on the success rate.

Unit test
    
    Item generator method: 
        items may have a maximum and minimum value per type, test with negative and random values
        test if an item 
    
    Type assignation: 
        test if items can only have one type assigned at a time
    
    Opportunity creation:
        test if a new opp. has items attached to it
        
    Player inventory:
        test for adding and removing items
        test for adding and removing money from the player's account
    
