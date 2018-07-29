function check(nums) {
	numbers = nums[0].split(' ').map(Number);
	let a = numbers[0];
	let b = numbers[1];
	let c = numbers[2];
	
	let result;
	if (a + b == c) {
		result = `${Math.min(a, b)} + ${Math.max(a, b)} = ${c}`;
	} else if (b + c == a) {
		result = `${Math.min(c, b)} + ${Math.max(c, b)} = ${a}`;
	} else if (a + c == b) {
		result = `${Math.min(c, a)} + ${Math.max(c, a)} = ${b}`;
	} else {
		result = "No";
	}
	
	return result;
}

check(["8 15 7"])