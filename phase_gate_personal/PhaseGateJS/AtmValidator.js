function ccValidator(input){
    if(input[0] == 4 && input.length == 16){
        let validityCorrect = {valid: true, issuer: "Visa"};
        return validityCorrect;
    }
    else if(input[0] == 5 && input.length == 16){
        let validityCorrect = {valid: true, issuer: "MasterCard"};
        return validityCorrect;
    }
    else if(input[0] == 6 && input.length == 16){
        let validityCorrect = {valid: true, issuer: "Discover"};
        return validityCorrect;
    }
    else if(input[0] == 3 && input.length == 15){
        let validityCorrect = {valid: true, issuer: "American Express"};
        return validityCorrect;
    }
    else {
        return validityWrong = {valid: false, reason: "Invalid Card"};
    }
}

let ccNums = [3,9,3,4,5,7,9,7,6,8,7,6,8,9,'p'];
console.log(ccValidator(ccNums));

