function solve(input) {
	let result;
	if (input[0] > input[1]) {
		result = input[0] / input[1];
	} else {
		result = input[0] * input[1];
	}
	console.log(result);
}