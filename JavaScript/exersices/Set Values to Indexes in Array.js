function solve(input) {
	//let arr = new Array(input[0]).fill(0);
	let arr = Array.from(Array(Number(input[0])), () => 0);
	
	for (let i = 1; i < input.length; i++) {
		let splited = input[i].split(" - ");
		arr[splited[0]] = splited[1];
	}
	
	console.log(arr.join('\n'))
}

solve(["2", "0 - 5", "0 - 6", "0 - 7"]);