In this challange you neeed to create an application for controlling a smart kitchen.
The smart kitchen will have several appliances

addWater() will set the Coffee Maker's hasWorkToDo field to true
pourMilk will set the Refrigerator's hasWorkToDo field to true
loadDishwasher() will set the Dishwasher's hasWorkToDo field to true

To execute the work needed to be done by the appliances, you'll implement this in 2 ways:

First, your application will access each appliance by using a getter and execute a method.
    **The appliance methods should check the hasWorkToDo flag, and if true, print a message out indicationg the work is being done.

Second your application won't accesss the appliances directly.
    **It should call doKitchenWork(), which delegates the work to any of its appliances.
________________________________
|*Class*                        |
|Smart kitchen                  | 
|_______________________________|
|*Fields*                       |
|brewMaster: CoffeeMaker        |
|dishWasher: DishWasher         | 
|iceBox:Refrigeratior           | 
|_______________________________|
|*Methods*                      |
|addWater()                     |
|pourMilk()                     |
|loadDishwasher()               |
|setKitchenState(boolean,       | 
|       boolean, boolean)       |
|doKitchenWork()                |
|_______________________________|
             ^
             v
_________________________________
|*Class*                        |     
|Refrigerator                   | 
|_______________________________|
|*Fields*                       |
|hasWorkToDo: boolean           | 
|_______________________________|
|*Methods*                      |
|orderFood()                    |
|_______________________________|        

            &
_________________________________
|*Class*                        |     
|DishWasher                     | 
|_______________________________|
|*Fields*                       |
|hasWorkToDo: boolean           | 
|_______________________________|
|*Methods*                      |
|doDishes()                     |
|_______________________________|        

            &
_________________________________
|*Class*                        |     
|CoffeeMaker                    | 
|_______________________________|
|*Fields*                       |
|hasWorkToDo: boolean           | 
|_______________________________|
|*Methods*                      |
|brewCoffee()                     |
|_______________________________|    
