Age (If statement exercise)

1. Make an app which tells you what you can do depending your age.
2. Start with this code:
            int age = 10;
            if (age > 0 && age < 18)
            {
                 System.out.println("You are underage.");
            }
            else
            {
                 System.out.println("You are an adult.");
            }

             System.out.println("Press space to exit.");
            

Run the app and test the app using different age values.

3. Let’s make the conditions a bit better…
            if (age > 0 && age < 18)
            {
                 System.out.println("You are underage.");
            }
            else if (age >= 65)
            {
                 System.out.println("You are retired.");
            }
            else
            {
                 System.out.println("You are an adult.");
            }  

Try again with different age values.

4. And a bit further again…
            if (age > 0 && age < 18)
            {
                 System.out.println("You are underage.");
                if (age >= 15)
                    {
                     System.out.println("You can drive a moped.");
                    }
            }
            else if (age >= 65)
            {
                 System.out.println("You are retired.");
            }
            else
            {
                 System.out.println("You are an adult.");
            }

Now if your age is 15-17 you can drive a moped. Test also with age values around the conditions like 65, 66.

5. Continue with at least some of the following. 
a.	If the age is equal to 18, print: ”You can drive a car”.
b.	If the age is 10,20,30,40,50,60,70,80,90, 100, 110 or 120, print: ”Anniversary Party!!”
c.	If the age is 100, print three line congratulations!
d.	If the age is between 40-50 wish happy mid-life.


