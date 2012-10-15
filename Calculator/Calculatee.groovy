
println "Please enter a number: "
private String str = System.console().readLine()
int a = Integer.parseInt(str)

println "Now enter another: "
str = System.console().readLine()
int b	= Integer.parseInt(str)
	
    println "What would you like to do with these numbers? "
	println " Add - 1"
	println " Subtract - 2"
	println " Multiply - 3"
	println " Divide - 4"
	println " Modulus - 5"

	String choice = System.console().readLine()
Calculator myCalculator = new Calculator()

if(choice == "1"){
	println myCalculator.add(a,b)
} else if(choice == "2"){
	println myCalculator.subtract(a,b)
} else if(choice == "3"){
	println myCalculator.multiply(a,b)
} else if(choice == "4"){
	println myCalculator.divide(a,b)
} else if(choice == "5"){
	println myCalculator.modulus(a,b)
} else {
	println "incorrect value entered"
}