function solve(input) {
	let count = 0;
	for (var i = 0; i < input.length; i++) {
		if (input[i] < 0) {
			count++;
		}
	}
	if(count % 2 != 0) {
		console.log("Negative");
	} else {
		console.log("Positive");
	}
}

solve([2, 3, 4])