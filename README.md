# SE-Assignment
this is my assignment of Software engneering for Dr.Gulsher leghari


**Documentation for ATM Code:**

This awesome code represents a basic ATM (Automated Teller Machine) program. It lets users register their unique ATM number and super-secret PIN code, and engage in thrilling transactions such as checking their balance, transferring funds, and withdrawing cash. The code even knows when to put an end to the party if you try to log in too many times with the wrong credentials. Exciting stuff, right?

Let's dive into the nitty-gritty details of this cool code:

1. **`atm` Class:** This is like the boss class that holds all the magic. It has all the methods and functionalities to make the ATM experience truly mind-blowing.

   - **`deposit` Variable:** Woah, this variable keeps track of the mighty account balance. You gotta keep an eye on it!

   - **`atm()` Method:** Brace yourself! This method is where the real action happens. It starts with a warm welcome message and urges you to create your own ATM number and PIN code. Then, it lets you deposit some hard-earned cash. Now comes the validation part. It's like a thrilling game show where you have three attempts to enter your ATM number and PIN code correctly. If you succeed, you'll be showered with congratulations and be granted access to perform mind-boggling transactions using the `performTransactions()` method. But if you fail, well, the code is ruthless and will terminate your account. Sad times, I know.

   - **`performTransactions()` Method:** Hold on to your seat, because this method takes you on a rollercoaster ride of options. It gives you a menu to select your account type, whether it's saving, current, or default. Once you've made up your mind, the code presents you with even more choices. You can check your balance, transfer funds to someone lucky, withdraw cold hard cash, or simply exit and take a breather. Whatever option you choose, the code knows how to handle it and directs you to the right method to make your dreams come true.

   - **`fundTransfer()` Method:** This method is like the magician of transfers. You tell it how much you want to transfer, and it makes sure you have enough moolah in your account. If you do, it waves its wand and magically deducts the transfer amount from your balance. Amazing, right? But beware, if you don't have enough dough, this method will give you a reality check and let you know that your balance is just not up to the task.

   - **`cashWithdrawal()` Method:** Now, this method is the cash dispenser of your dreams. You enter the amount you want to withdraw, and it checks if you have the cash to back it up. If you do, it becomes your best friend and hands over the money. But if your balance is not playing nice, it's like that friend who conveniently forgets their wallet and lets you know that you simply don't have enough cash in your account. Tough luck!

   - **`terminateAccount()` Method:** Ah, the end of the line. This method delivers the final blow by announcing that your account has been terminated. Ouch, that stings!

   - **`main()` Method:** This is where the party starts! It creates some kind of magical scanner to capture your input. It then invites you to the ATM world, where you can have a blast with all the transactions. But remember, the code also asks if you want to continue the adventure or exit. It's your choice, my friend.

2. **Usage:**

   To embark on this incredible ATM journey, follow these steps:

   - Run this marvelous code using an IDE or by unleashing the power of the command
