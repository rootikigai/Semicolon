function ccValidator(String){
    let input = ''
	for (let i = '0'; i < 17; i++) {
        input += i;

        let validityCorrect = {};
	    let validityWrong = {};

		    if(input[0] == '4' && input.length == 16){
			    validityCorrect = {valid: true, issuer: "Visa"};
		    }
		    else if(input[0] == '5' && input.length == 16){
			    validityCorrect = {valid: true, issuer: "MasterCard"};
		    }
		    else if(input[0] == '6' && input.length == 16){
			    validityCorrect = {valid: true, issuer: "Discover"};
		    }
		    else if(input[0] == '3' && input.length == 15){
			    validityCorrect = {valid: true, issuer: "American Express"};
		    }
		    else {
			    validityWrong = {valid: false, reason: "Invalid Card"};
		    }
	return /*validityCorrect || */validityWrong;
	}
}
console.log(ccValidator('5674839857382948'));
