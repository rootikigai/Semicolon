function removeBugs(priorityNums){
    priorityNums = []
    for(let num = 1; num <= 5; num++){
        priorityNums.push(num)        
    }
    return priorityNums
}
console.log(removeBugs(0,1,2,3,4,5,6))
