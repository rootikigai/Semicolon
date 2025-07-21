function arrayMedian(array1, array2){
    const mergedArrays = array1.concat(array2);
    mergedArrays.sort((a, b) => a - b);
    if (mergedArrays.length === 0) {
        return null;
    }
    if (mergedArrays.length === 1) {
        return mergedArrays[0];
    }
    const mid = Math.floor(mergedArrays.length / 2);
    
    if (mergedArrays.length % 2 === 0) {
        return (mergedArrays[mid - 1] + mergedArrays[mid]) / 2;
    } else {
        return mergedArrays[mid];
    }
}

const arr1 = [1, 3, 6, 8, 2];
const arr2 = [2, 5, 6, 7, 8];
const merged = arr1.concat(arr2);
console.log(merged.sort((a, b) => a - b));
console.log(arrayMedian(arr1, arr2));