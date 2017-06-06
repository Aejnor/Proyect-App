This app is a list with weapons of the 2 World War, where you can add, delete and show it, listed by the type of gun they are.
______________________________________________________________________________________________________________________________

________________________________________________ DOCUMENTATION OF THE APP_____________________________________________________


---- Classes in the packcage "model" ----

    -- Gun --

- Attributes of the class:
	- String name
	- String originCountry
	- int ammunitionClip
	- Double gauge

- Constructors, one of them is empty, the other one is with all the attributes.
- Getters and Setters from the attributes.

    
    -- Menu --
    
- This class contains all the menus what user sees in the app

- Also we got some exceptions in it, just 2 of them.
- In it we use the method fillArray to put some "test weapons".




---- Class in the packcage "controller" ----

    -- AppController --

- This class gestore all the methods of the app.

- Attributes of the class: 
	- ArrayList<Gun> rifles
        - ArrayList<Gun> assaultRifles
    	- ArrayList<Gun> subMachineGuns
    	- ArrayList<Gun> sniperRifles 

- One constructor who initializes the arrays.
- Getters and setters for the attributes.

- Methods to add, delete and show them. By type of weapon.
- Two helpers methods to use them when we want to launch some message about any type of exception that launches the program.


________________________________________________ What i want to add in a future _____________________________________________________


- Add some methods to edit the weapon you want, if you fail in the introduction of data.
- Add some graphic enviorement.
- Add connection to a DB to have the weapons always with some new features like some bid webpages for if you want to buy any of them.
- Add a method to find the weapon the user select to find then in the webpage i already tell you.
- In the added graphic enviorement, add pictures of the weapons and more info about them. 

