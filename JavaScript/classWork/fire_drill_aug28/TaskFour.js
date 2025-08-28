const inventory = {
    apples: 10,
    bananas: 5,
    oranges: 8,
    mangoes: 12
};

for (let fruit in inventory) {
    console.log(`We have ${inventory[fruit]} ${fruit}`);
}

console.log();

let totalFruits = 0;
for (let fruit in inventory) {
    totalFruits += inventory[fruit];
}
console.log("Total number of fruits in inventory:", totalFruits);

module.exports = inventory;