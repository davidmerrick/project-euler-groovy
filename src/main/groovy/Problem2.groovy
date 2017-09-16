/**

 Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

 */

limit = 4000000
fibArray = []
nMinusTwo = 1
nMinusOne = 2
fibArray.add(nMinusOne)
fibArray.add(nMinusTwo)
currentValue = nMinusOne + nMinusTwo

while(currentValue < limit){
    fibArray.add(currentValue)
    currentValue = nMinusOne + nMinusTwo
    nMinusTwo = nMinusOne
    nMinusOne = currentValue
}

sum = fibArray.findAll{
    it % 2 == 0
}.sum()

println sum