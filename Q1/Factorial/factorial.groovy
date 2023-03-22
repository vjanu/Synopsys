def factorial(int n) {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

def scanner = new Scanner(System.in)
print("Enter the value to calculate factorial: ")
def n = scanner.nextInt()

def value = factorial(n)
println "Factorial Value of $n is $value"
