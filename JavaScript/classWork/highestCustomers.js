function namesOfHighScoringCustomers(customers) {
    let highCustomers = [];
    for (let index = 0; index < customers.length; index++) {
        let customer = customers[index];
        let name = Object.keys(customer)[0];
        let score = customer[name];
        if (score > 80) {
            highCustomers.push(name);
        }
    }
    return highCustomers;
}

let allCustomers = [
    {"Kelvin": 89}, 
    {"Ikigai": 100},
    {"Motun": 55},
    {"Evans": 81},
    {"Silas": 23}
];
console.log(namesOfHighScoringCustomers(allCustomers));