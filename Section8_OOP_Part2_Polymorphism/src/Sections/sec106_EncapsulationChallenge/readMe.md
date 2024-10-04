Create a class named printer

class:
Printer

---

fields:
tonerLevel: int -> percentage of toner left in the toner cartridge

pagesPrinted: int -> count of total pages printed

duplex: boolean -> indicator of wheter the printer will print on both sides. True means it can false means only one side per page

methods:
addToner(int tonerAmount): int
_ tonerAmount is added to the tonerLevel field
_ The tonerLevel should never exceed 100% or get below 0%
_ If the amount being added makes the level fall outside that range return a -1 from the method other wise return the actual toner level after adding the amount passed to the method.
printPages(int): int
_ it should determine how many sheets of paper will be printed. it should take into account the duplex value set for the printer. it should return the calculated number of sheets of paper.
_ the sheet number should also be added to the pagesPrinted field
_ if its a duplex printer, printer a message that it's a duplex.

$ printPages() should take pages to printed as the argument
-It should determine how many sheets of paper will be printed. It should take into account the duplex value set for the printer. It should return the calculated number of sheets of paper.
-the sheet number should aslo be added to the pagesPrinted field.
-if it's a duplex printer, print a message that it's a duplex printer.

