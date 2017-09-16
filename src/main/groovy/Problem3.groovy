/**

 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?

 */

// Todo: this is a WIP. Idea: generate primes using Sieve of Eratosthenes or similar method, then use those to find prime factors of given number

def isPrime = { num ->
    if(num == 1){
        return true
    }
    factors = []
    for(i = 2L; i < num; i++){
        if(num % i == 0) {
            factors.add(i)
        }
    }
    return factors.size() == 0
}

long n = 13195
factors = []
for(i = 1L; i < n; i++) {
    if (n % i == 0 && isPrime(i)){
        factors.add(i)
    }
}
factors.forEach{
    println it
}