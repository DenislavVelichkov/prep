function findLargest(numbers) {
    let tempNumber = Number.MIN_VALUE;

    for (let i = 0; i < numbers.length; i++) {
        if(numbers[i] > tempNumber) {
            tempNumber =numbers[i];
        }
    }

    return tempNumber;
}

console.log(findLargest([1, -28, 88, 200, 7]));