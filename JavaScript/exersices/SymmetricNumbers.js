function summetricNumbers(arr) {
	let number = Number(arr[0]);
	let result = '';
	
	for (let i = 1; i <= number; i++) {
		if (check(i.toString())) {
			result += i + " ";
		}
	}
	console.log(result);
	
	function check(str) {	
		for (let a = 0; a < str.length / 2; a++) {
			if (str[a] != str[str.length - a - 1]) {
				return false;
			}
		}
		return true;
	}
}


summetricNumbers([2000]);